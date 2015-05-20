package com.intropro.cfengine.api.pojo.api;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "page", "count", "total", "timestamp" })
public class Meta {

	@JsonProperty("page")
	private long page;
	@JsonProperty("count")
	private long count;
	@JsonProperty("total")
	private long total;
	@JsonProperty("timestamp")
	private long timestamp;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The page
	 */
	@JsonProperty("page")
	public long getPage() {
		return page;
	}

	/**
	 *
	 * @param page
	 *            The page
	 */
	@JsonProperty("page")
	public void setPage(long page) {
		this.page = page;
	}

	public Meta withPage(long page) {
		this.page = page;
		return this;
	}

	/**
	 *
	 * @return The count
	 */
	@JsonProperty("count")
	public long getCount() {
		return count;
	}

	/**
	 *
	 * @param count
	 *            The count
	 */
	@JsonProperty("count")
	public void setCount(long count) {
		this.count = count;
	}

	public Meta withCount(long count) {
		this.count = count;
		return this;
	}

	/**
	 *
	 * @return The total
	 */
	@JsonProperty("total")
	public long getTotal() {
		return total;
	}

	/**
	 *
	 * @param total
	 *            The total
	 */
	@JsonProperty("total")
	public void setTotal(long total) {
		this.total = total;
	}

	public Meta withTotal(long total) {
		this.total = total;
		return this;
	}

	/**
	 *
	 * @return The timestamp
	 */
	@JsonProperty("timestamp")
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 *
	 * @param timestamp
	 *            The timestamp
	 */
	@JsonProperty("timestamp")
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Meta withTimestamp(long timestamp) {
		this.timestamp = timestamp;
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

	public Meta withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}