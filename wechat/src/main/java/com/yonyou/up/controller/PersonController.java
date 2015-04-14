package com.yonyou.up.controller;

import java.io.IOException;
import java.io.StringWriter;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.yonyou.up.domain.Person;
import com.yonyou.up.repository.PersonRepository;
import com.yonyou.up.service.IPersonService;

@RestController
public class PersonController {
	private Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired
	private PersonRepository repository;
	@Autowired
	private IPersonService service;
	@Resource(name = "client")
	private com.yonyou.up.webservice.client.BPOSUNTESTServiceSoap client;

	@RequestMapping("/person/add")
	public Person Add(Person person) {

		Person pe = repository.save(person);
		return pe;
	}

	@RequestMapping("/person/count")
	public long Count() {

		logger.info("人员数量");
		return repository.count();

	}

	@RequestMapping("/person/test")
	public String test() {

		return service.test();

	}

	@RequestMapping("/person/kuka/getXML1")
	public String getXML1() {

		String confxml = "<config><StartPos>11</StartPos><PageCount>10</PageCount><SQLCondi></SQLCondi><SQLFix></SQLFix></config>";

		String response = client
				.getXML1("6006004", "BC_KuKa_Business", confxml);

		String aa = null;

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			XmlMapper xmlMapper = new XmlMapper();
			StringWriter w = new StringWriter();
			JsonParser jp = xmlMapper.getFactory().createParser(response);
			JsonGenerator jg = objectMapper.getFactory().createGenerator(w);
			while (jp.nextToken() != null) {
				jg.copyCurrentEvent(jp);
			}
			jp.close();
			jg.close();
			aa = w.toString();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return aa;
	}
}
