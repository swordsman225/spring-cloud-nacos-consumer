package com.huawei.hicloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "nacos-provider")
@RequestMapping(value = "/v1")
public interface INacosProviderClient {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Map<String, Object> getInfo();

}
