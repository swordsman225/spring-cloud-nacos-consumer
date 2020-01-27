package com.huawei.hicloud.rpc.feign.fallback;

import com.huawei.hicloud.rpc.feign.client.INacosProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class NacosProviderClientFallback implements INacosProviderClient {

    private static final Logger logger = LoggerFactory.getLogger(NacosProviderClientFallback.class);

    @Override
    public Map<String, Object> getInfo() {
        logger.info("Get info fail!");

        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 500);
        result.put("msg", "Get info fail!");

        return result;
    }
}
