package com.ejemploREST.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")
public class Various {

	@GET
	@Path("/obligame")
	public String mensajitu() 
	{
		return "Obligame Prro!!!";
	}
}
