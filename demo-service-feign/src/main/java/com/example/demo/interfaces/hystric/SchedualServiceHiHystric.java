/*
 * 文 件 名 : SchedualServiceHiHystric
 * 版    权 : CZYSOFT TECHNOLOGY CO.,LTD.Copyright 2017-2030.All rights reserved
 * 描    述 : <描述>
 * 修 改 人 : <003912>wuchaoliang@inner.czy.com
 * 修改时间 : 2017-12-14 18:13
 * 需求单号 : <需求Redmine单号>
 * 变更单号 : <变更Redmine单号>
 * 修改内容 : <修改内容>
 * Version : V1.0.0
 */
package com.example.demo.interfaces.hystric;

import com.example.demo.interfaces.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * demo-spring-cloud-root -- com.example.demo.interfaces.hystric
 *
 * @author 003912 wuchaoliang
 * @version 1.0.0
 * @Description:
 * @ClassName: SchedualServiceHiHystric
 * @see
 * @since description
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}