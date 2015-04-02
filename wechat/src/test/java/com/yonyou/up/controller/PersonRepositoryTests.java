package com.yonyou.up.controller;

import static org.junit.Assert.assertTrue;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.yonyou.up.app.Application;
import com.yonyou.up.domain.Person;
import com.yonyou.up.repository.PersonRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
//@ContextConfiguration(classes = Application.class,initializers = ConfigFileApplicationContextInitializer.class)
@WebIntegrationTest({"server.port=0", "management.port=0"})
@Transactional 
public class PersonRepositoryTests {
	
	    @Autowired
	    PersonRepository repository;
	    
	    RestTemplate restTemplate = new TestRestTemplate();

		@Test
		public void testRequest() throws Exception {
			String ret=restTemplate.getForObject("http://172.20.8.155:8090/wechat/equipment/all.json", String.class);
				
			assertTrue(ret.contains("thinkpadE430"));
		}
		
		@Test
		public void testFindByname() throws Exception {
			Person person=new Person();
			person.setfirstname("jim");
			person.setlastname("张三");
			
			repository.save(person);
			Person pn=repository.findByname("张三");
			assertTrue(pn.getfirstname().equals("jim"));
		}
		
		
}
