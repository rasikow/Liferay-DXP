package com.user.rest.service;

public class User {

		public long   id = -1;
		public String lastName;
		public String firstName;
		public String country;
		
		public User() {}
		
		public User(long id, String first, String last, String country) {
			this.id = id;
			this.firstName = first;
			this.lastName = last;
			this.country = country;
		}	
}