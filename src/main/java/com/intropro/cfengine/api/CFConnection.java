package com.intropro.cfengine.api;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.intropro.cfengine.api.mime.CFEngineMimeType;
import com.intropro.cfengine.api.pojo.api.Api;
import com.intropro.cfengine.utils.ClientHelper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;

public class CFConnection {

	private String server;
	private Client client;
	private boolean debug = false;

	/**
	 * Init new instance
	 */
	public CFConnection() {
	}

	/**
	 * Init new instance with/without debug
	 * 
	 * @param debug
	 */
	public CFConnection(boolean debug) {
		this.debug = debug;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	/**
	 * Get connection with username and password
	 * 
	 * @param username
	 * @param password
	 */
	public Client connect(String server, String username, String password) {
		this.server = server;
		client = ClientHelper.createClient();
		if (debug)
			client.addFilter(new LoggingFilter());
		client.addFilter(new HTTPBasicAuthFilter(username, password));

		return client;
	}

	/**
	 * Use https-connection gets its api object with server address
	 * 
	 * @param server
	 */
	public Api getApiResponse() {
		WebResource webResource = client.resource("https://" + server).path("/api/");
		ClientResponse response = webResource.header(HttpHeaders.USER_AGENT, "jersey-client").accept(CFEngineMimeType.CFENGINE).get(ClientResponse.class);

		return response.getEntity(Api.class);
	}
}
