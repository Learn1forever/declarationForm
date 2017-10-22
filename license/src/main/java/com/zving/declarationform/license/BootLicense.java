package com.zving.declarationform.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.servicecomb.foundation.common.utils.Log4jUtils;
import io.servicecomb.springboot.starter.provider.EnableServiceComb;

@SpringBootApplication
@EnableServiceComb
@EnableDiscoveryClient
public class BootLicense {

	public static void main(String[] args) throws Exception {
		Log4jUtils.init();
		SpringApplication.run(BootLicense.class, args);
	}
}
