package com.intropro.cfengine.api.pojo.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "meta", "data" })
public class Api {

	@JsonProperty("meta")
	private Meta meta;
	@JsonProperty("data")
	private List<Datum> data = new ArrayList<Datum>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The meta
	 */
	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}

	/**
	 *
	 * @param meta
	 *            The meta
	 */
	@JsonProperty("meta")
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Api withMeta(Meta meta) {
		this.meta = meta;
		return this;
	}

	/**
	 *
	 * @return The data
	 */
	@JsonProperty("data")
	public List<Datum> getData() {
		return data;
	}

	/**
	 *
	 * @param data
	 *            The data
	 */
	@JsonProperty("data")
	public void setData(List<Datum> data) {
		this.data = data;
	}

	public Api withData(List<Datum> data) {
		this.data = data;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Api withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}