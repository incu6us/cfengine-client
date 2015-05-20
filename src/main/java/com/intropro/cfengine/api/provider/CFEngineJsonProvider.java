package com.intropro.cfengine.api.provider;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.intropro.cfengine.api.mime.CFEngineMimeType;

@Provider
@Consumes(CFEngineMimeType.CFENGINE)
@Produces(CFEngineMimeType.CFENGINE)
public class CFEngineJsonProvider extends JacksonJsonProvider {

}
