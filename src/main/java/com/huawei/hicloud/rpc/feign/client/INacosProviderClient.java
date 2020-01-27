package com.huawei.hicloud.rpc.feign.client;

import com.huawei.hicloud.rpc.feign.fallback.NacosProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "nacos-provider", fallback = NacosProviderClientFallback.class)
public interface INacosProviderClient {

    @RequestMapping(value = "/v1.0/info", method = RequestMethod.GET)
    public Map<String, Object> getInfo();

}
