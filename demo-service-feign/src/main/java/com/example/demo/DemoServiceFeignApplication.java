/*
 * 文 件 名 : Application
 * 版    权 : CZYSOFT TECHNOLOGY CO.,LTD.Copyright 2017-2030.All rights reserved
 * 描    述 : <描述>
 * 修 改 人 : <003912>wuchaoliang@inner.czy.com
 * 修改时间 : 2017-12-14 17:33
 * 需求单号 : <需求Redmine单号>
 * 变更单号 : <变更Redmine单号>
 * 修改内容 : <修改内容>
 * Version : V1.0.0
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * demo-spring-cloud-root -- com.example.demo
 *
 * @author 003912 wuchaoliang
 * @version 1.0.0
 * @Description:
 * @ClassName: Application
 * @see
 * @since description
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class DemoServiceFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoServiceFeignApplication.class);
    }
}