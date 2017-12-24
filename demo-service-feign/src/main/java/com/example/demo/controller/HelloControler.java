/*
 * 文 件 名 : HelloControler
 * 版    权 : CZYSOFT TECHNOLOGY CO.,LTD.Copyright 2017-2030.All rights reserved
 * 描    述 : <描述>
 * 修 改 人 : <003912>wuchaoliang@inner.czy.com
 * 修改时间 : 2017-12-14 16:38
 * 需求单号 : <需求Redmine单号>
 * 变更单号 : <变更Redmine单号>
 * 修改内容 : <修改内容>
 * Version : V1.0.0
 */
package com.example.demo.controller;

import com.example.demo.interfaces.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo-spring-cloud-root -- com.example.demo.controller
 *
 * @author 003912 wuchaoliang
 * @version 1.0.0
 * @Description:
 * @ClassName: HelloControler
 * @see
 * @since description
 */
@RestController
public class HelloControler {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }


}