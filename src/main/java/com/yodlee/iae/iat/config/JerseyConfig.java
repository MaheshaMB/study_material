package com.yodlee.iae.iat.config;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import io.swagger.models.Contact;
import io.swagger.models.Info;
import io.swagger.models.License;

@Component
@PropertySource("classpath:application.properties")
public class JerseyConfig extends ResourceConfig {

	@Value("${spring.jersey.application-path}")
	private String apiPath;

	@Autowired
	public JerseyConfig() {
		this.packages("com.yodlee.iae.iat.rest");
		this.register(WadlResource.class);
	}

	@PostConstruct
	public void init() {
		this.configureSwagger();
	}

	private void configureSwagger() {

		this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);

		BeanConfig config = new BeanConfig();
		config.setSchemes(new String[] { "http", "https" });
		config.setBasePath(this.apiPath);
		config.setResourcePackage("com.yodlee.iae.iat.rest");
		config.setPrettyPrint(true);
		config.setScan(true);
		config.setInfo(this.metaData());
	}

	private Info metaData() {
		Info info = new Info();
		info.setTitle("IAT 2.0 Rest API end point");
		info.setDescription("REST API for IAT 2.0 application service.");
		info.setVersion("1.0");
		info.setContact(new Contact().email("mboraiah@yodlee.com").name("mahesh boraiah").url("https://springframework.guru/about/"));
		info.setLicense(new License().name("IAT-2.0 Architecture document (V 1.0)").url("http://intranet.yodlee.com/twiki/bin/view/IAE/IATArchitecture"));
		info.setTermsOfService("Terms of service");
		return info;
    }
	
}
