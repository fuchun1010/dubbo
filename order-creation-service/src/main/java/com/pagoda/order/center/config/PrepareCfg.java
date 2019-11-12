package com.pagoda.order.center.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tank198435163.com
 */
@Configuration
public class PrepareCfg {

  @Bean
  public ObjectMapper initObjectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    return mapper;
  }
}
