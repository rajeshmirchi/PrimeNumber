package com.synechron.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * This Class is used to implement the functionality of Content Negotiation
 * 
 * @author Rajesh Kurapati
 *
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	/**
	 * This Method is used to implement the functionality of content negotiation configuration
	 *
	 */
	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

		// set path extension to true
		configurer.favorPathExtension(true);
//
//		// set favor parameter to false
//		configurer.favorParameter(false);
//
//		// the favour parameter is set to "mediaType" instead of default
//		configurer.parameterName("mediaType");

		// ignore the accept headers
		configurer.ignoreAcceptHeader(true);

		configurer.defaultContentType(MediaType.APPLICATION_JSON);
		configurer.mediaType("xml", MediaType.APPLICATION_XML);
		configurer.mediaType("json", MediaType.APPLICATION_JSON);

	}

}
