package com.api202410.java_restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/*
 * Step 1: Add annotation
 * 
 * @Configuration
 */
@Configuration
public class AppConfig {

  /*
   * Step 2:
   * 
   * @Bean > RestTemplate for call API
   */
  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
