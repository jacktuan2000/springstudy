package com.yonyou.up.domain;

import javax.persistence.Entity;

@Entity
public class Person extends BaseDomain{

	    private String firstname;
		private String lastname;
		
		public String getfirstname() {
			return firstname;
		}

		public void setfirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getlastname() {
			return lastname;
		}

		public void setlastname(String lastname) {
			this.lastname = lastname;
		}
		
		public Person() 
		 {
			  
		  }

}
