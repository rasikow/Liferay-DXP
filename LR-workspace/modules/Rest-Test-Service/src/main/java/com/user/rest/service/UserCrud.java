package com.user.rest.service;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path("/user")

public class UserCrud {
	
	
	// Return all available list of users
	
	@GET
	@Produces("application/json")
	public List<User> getAllPeople() {
		return userList;
	}

	// Return a single user based on Id
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Response getUser(@PathParam("id") String id) {
		ResponseBuilder builder;
		try {
			User user = findById(new Long(id));
		  if (user != null) {
			  builder = Response.ok(user);
		  } else {
			  builder = Response.status(Response.Status.NOT_FOUND).entity("User not found for ID: " + id);
		  }
		} catch (Exception e) {
			builder = Response.status(Response.Status.NOT_FOUND).entity("Exception occurred for ID: " + id);
			e.printStackTrace();
		}
		return builder.build();
	}
		
    // Adding new employee
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public User addUser(User user) {
		// Generate Random Id for new user
		user.id = new Date().getTime();
		userList.add(user);
		return user;
	}
	
	// Update existing User
	
	@PUT
	@Path("{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response updateEmployee(User newEmployee, @PathParam("id") String id) {
		  ResponseBuilder builder = null;
		  User oldEmployee = findById(new Long(id));
		  if (oldEmployee != null) {
			  oldEmployee.firstName = newEmployee.firstName;
			  oldEmployee.lastName = newEmployee.lastName;
			  oldEmployee.country = newEmployee.country;
			  builder = Response.ok(oldEmployee);
		  } else {
			  builder = Response.status(Response.Status.NOT_FOUND).entity("\r\n" + 
			  		"		int not found for ID: " + id);
		  }
		
		return builder.build();
	}
	
   // Delete Employee based on Id
	
   @DELETE
   @Path("{id}")
   public Response deleteEmployee(@PathParam("id") String id) {
		ResponseBuilder builder =  Response.status(Response.Status.NOT_FOUND).entity("User not found for ID: " + id);
		long employeeId = new Long(id);
		int index = 0;
		for (User employee : userList) {
			if (employee.id == employeeId) {
				userList.remove(index);
				builder = Response.ok();
				break;
			} else {
				index++;
			}
		}
		return builder.build();
	}
	
	// Method to find mataching employee based on provided Id
   
	private User findById(long id) {
		for (User user : userList) {
			if (user.id == id) {
				return user;
			}
		}
		return null;
	}
	
	// Sample data for employees
	
    private static List<User> userList = new ArrayList<User> ();
    static {
    	userList.add(new User(1, "Gnaniyar","Architect","TN"));
    	userList.add(new User(2, "Valiyulla","Audit","KE"));
    	userList.add(new User(3, "Syedali","Devops","MI"));
    }
}