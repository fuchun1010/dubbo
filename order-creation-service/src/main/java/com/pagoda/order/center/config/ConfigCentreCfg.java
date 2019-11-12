package com.pagoda.order.center.config;

import org.apache.dubbo.config.ConfigCenterConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.ConfigCenterBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCentreCfg {

  @Bean
  public RegistryConfig registryConfig() {
    RegistryConfig registryConfig = new RegistryConfig();
    registryConfig.setAddress("zookeeper://127.0.0.1:2181");
    return registryConfig;
  }

}
