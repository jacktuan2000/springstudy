package com.yonyou.up.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Person extends BaseDomain{
	    @NotEmpty(message="{name.not.empty}")
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
