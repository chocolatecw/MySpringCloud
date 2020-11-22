package com.cw.warehouseenter.client;

import com.cw.warehouseenter.model.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "warehouseout", fallback = WarehouseOutClientHystric.class)
public interface WarehouseOutClient {

    @RequestMapping("/api/output/getUserInfo")
    String getUserInfo();


}
