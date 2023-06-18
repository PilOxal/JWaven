package com.oxal.jwaven.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.net.URISyntaxException;

@Configuration
public class CommonConfiguration {

    private static final String RESOURCE_WAVEN_NAME = "WavenData";
    @Bean("wavenResource")
    public File getWavenResourceFolder() throws URISyntaxException {
        return new File(getClass().getClassLoader().getResource(RESOURCE_WAVEN_NAME).toURI());
    }
}
