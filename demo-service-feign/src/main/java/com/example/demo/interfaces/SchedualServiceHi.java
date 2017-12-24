/*
 * 文 件 名 : SchedualServiceHi
 * 版    权 : CZYSOFT TECHNOLOGY CO.,LTD.Copyright 2017-2030.All rights reserved
 * 描    述 : <描述>
 * 修 改 人 : <003912>wuchaoliang@inner.czy.com
 * 修改时间 : 2017-12-14 17:20
 * 需求单号 : <需求Redmine单号>
 * 变更单号 : <变更Redmine单号>
 * 修改内容 : <修改内容>
 * Version : V1.0.0
 */
package com.example.demo.interfaces;

import com.example.demo.interfaces.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * demo-spring-cloud-root -- com.example.demo.interfaces
 *
 * @author 003912 wuchaoliang
 * @version 1.0.0
 * @Description:
 * @ClassName: SchedualServiceHi
 * @see
 * @since description
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}