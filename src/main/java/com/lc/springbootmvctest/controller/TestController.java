package com.lc.springbootmvctest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @author cdliuchao9
 * @date 2019-08-19 15:45
 * description:
 */
@RequestMapping("/test")
@RestController
@Slf4j
public class TestController {


    @RequestMapping("/time")
    public String time() {
        log.info("接收到test/time请求，当前时间 ：" + new Date());
        return "当前时间是: " + new Date();
    }

}
