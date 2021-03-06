/*
 * 文 件 名 : HelloService
 * 版    权 : CZYSOFT TECHNOLOGY CO.,LTD.Copyright 2017-2030.All rights reserved
 * 描    述 : <描述>
 * 修 改 人 : <003912>wuchaoliang@inner.czy.com
 * 修改时间 : 2017-12-16 11:58
 * 需求单号 : <需求Redmine单号>
 * 变更单号 : <变更Redmine单号>
 * 修改内容 : <修改内容>
 * Version : V1.0.0
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * demo-spring-cloud-root -- com.example.demo.service
 *
 * @author 003912 wuchaoliang
 * @version 1.0.0
 * @Description:
 * @ClassName: HelloService
 * @see
 * @since description
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}