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
@JsonPropertyOrder({ "expires", "owner", "licenseType", "granted" })
public class License {

	@JsonProperty("expires")
	private String expires;
	@JsonProperty("owner")
	private String owner;
	@JsonProperty("licenseType")
	private String licenseType;
	@JsonProperty("granted")
	private long granted;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The expires
	 */
	@JsonProperty("expires")
	public String getExpires() {
		return expires;
	}

	/**
	 *
	 * @param expires
	 *            The expires
	 */
	@JsonProperty("expires")
	public void setExpires(String expires) {
		this.expires = expires;
	}

	public License withExpires(String expires) {
		this.expires = expires;
		return this;
	}

	/**
	 *
	 * @return The owner
	 */
	@JsonProperty("owner")
	public String getOwner() {
		return owner;
	}

	/**
	 *
	 * @param owner
	 *            The owner
	 */
	@JsonProperty("owner")
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public License withOwner(String owner) {
		this.owner = owner;
		return this;
	}

	/**
	 *
	 * @return The licenseType
	 */
	@JsonProperty("licenseType")
	public String getLicenseType() {
		return licenseType;
	}

	/**
	 *
	 * @param licenseType
	 *            The licenseType
	 */
	@JsonProperty("licenseType")
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public License withLicenseType(String licenseType) {
		this.licenseType = licenseType;
		return this;
	}

	/**
	 *
	 * @return The granted
	 */
	@JsonProperty("granted")
	public long getGranted() {
		return granted;
	}

	/**
	 *
	 * @param granted
	 *            The granted
	 */
	@JsonProperty("granted")
	public void setGranted(long granted) {
		this.granted = granted;
	}

	public License withGranted(long granted) {
		this.granted = granted;
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

	public License withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
}
