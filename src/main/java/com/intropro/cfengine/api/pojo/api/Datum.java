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
@JsonPropertyOrder({ "apiName", "apiVersion", "enterpriseVersion", "uiVersion", "coreVersion", "authenticated", "userId", "license" })
public class Datum {

	@JsonProperty("apiName")
	private String apiName;
	@JsonProperty("apiVersion")
	private String apiVersion;
	@JsonProperty("enterpriseVersion")
	private String enterpriseVersion;
	@JsonProperty("uiVersion")
	private String uiVersion;
	@JsonProperty("coreVersion")
	private String coreVersion;
	@JsonProperty("authenticated")
	private String authenticated;
	@JsonProperty("userId")
	private String userId;
	@JsonProperty("license")
	private License license;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 *
	 * @return The apiName
	 */
	@JsonProperty("apiName")
	public String getApiName() {
		return apiName;
	}

	/**
	 *
	 * @param apiName
	 *            The apiName
	 */
	@JsonProperty("apiName")
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public Datum withApiName(String apiName) {
		this.apiName = apiName;
		return this;
	}

	/**
	 *
	 * @return The apiVersion
	 */
	@JsonProperty("apiVersion")
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 *
	 * @param apiVersion
	 *            The apiVersion
	 */
	@JsonProperty("apiVersion")
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public Datum withApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		return this;
	}

	/**
	 *
	 * @return The enterpriseVersion
	 */
	@JsonProperty("enterpriseVersion")
	public String getEnterpriseVersion() {
		return enterpriseVersion;
	}

	/**
	 *
	 * @param enterpriseVersion
	 *            The enterpriseVersion
	 */
	@JsonProperty("enterpriseVersion")
	public void setEnterpriseVersion(String enterpriseVersion) {
		this.enterpriseVersion = enterpriseVersion;
	}

	public Datum withEnterpriseVersion(String enterpriseVersion) {
		this.enterpriseVersion = enterpriseVersion;
		return this;
	}

	/**
	 *
	 * @return The uiVersion
	 */
	@JsonProperty("uiVersion")
	public String getUiVersion() {
		return uiVersion;
	}

	/**
	 *
	 * @param uiVersion
	 *            The uiVersion
	 */
	@JsonProperty("uiVersion")
	public void setUiVersion(String uiVersion) {
		this.uiVersion = uiVersion;
	}

	public Datum withUiVersion(String uiVersion) {
		this.uiVersion = uiVersion;
		return this;
	}

	/**
	 *
	 * @return The coreVersion
	 */
	@JsonProperty("coreVersion")
	public String getCoreVersion() {
		return coreVersion;
	}

	/**
	 *
	 * @param coreVersion
	 *            The coreVersion
	 */
	@JsonProperty("coreVersion")
	public void setCoreVersion(String coreVersion) {
		this.coreVersion = coreVersion;
	}

	public Datum withCoreVersion(String coreVersion) {
		this.coreVersion = coreVersion;
		return this;
	}

	/**
	 *
	 * @return The authenticated
	 */
	@JsonProperty("authenticated")
	public String getAuthenticated() {
		return authenticated;
	}

	/**
	 *
	 * @param authenticated
	 *            The authenticated
	 */
	@JsonProperty("authenticated")
	public void setAuthenticated(String authenticated) {
		this.authenticated = authenticated;
	}

	public Datum withAuthenticated(String authenticated) {
		this.authenticated = authenticated;
		return this;
	}

	/**
	 *
	 * @return The userId
	 */
	@JsonProperty("userId")
	public String getUserId() {
		return userId;
	}

	/**
	 *
	 * @param userId
	 *            The userId
	 */
	@JsonProperty("userId")
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Datum withUserId(String userId) {
		this.userId = userId;
		return this;
	}

	/**
	 *
	 * @return The license
	 */
	@JsonProperty("license")
	public License getLicense() {
		return license;
	}

	/**
	 *
	 * @param license
	 *            The license
	 */
	@JsonProperty("license")
	public void setLicense(License license) {
		this.license = license;
	}

	public Datum withLicense(License license) {
		this.license = license;
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

	public Datum withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

}