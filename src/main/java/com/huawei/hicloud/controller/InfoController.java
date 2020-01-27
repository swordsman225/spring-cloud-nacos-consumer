package com.huawei.hicloud.controller;

import com.huawei.hicloud.rpc.feign.client.INacosProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/v1.0/info")
public class InfoController {

    private static final Logger logger = LoggerFactory.getLogger(InfoController.class);

    @Autowired
    private INacosProviderClient iNacosProviderClient;

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public Map<String, Object> getInfo() {
        logger.info("### Get info ...");
        Map<String, Object> info = iNacosProviderClient.getInfo();

        return info;
    }

}
