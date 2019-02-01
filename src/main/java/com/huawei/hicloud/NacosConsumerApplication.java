package com.huawei.hicloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication {

    private static final Logger logger = LoggerFactory.getLogger(NacosConsumerApplication.class);

    public static void main(String[] args) {
        logger.info("### Nacos consumer application start ...");
        SpringApplication.run(NacosConsumerApplication.class, args);
    }

}
