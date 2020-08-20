package com.zhihuittu.sunbz.controller;

import com.zhihuittu.sunbz.entity.Person;
import com.zhihuittu.sunbz.entity.Rsp;
import com.zhihuittu.sunbz.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/pserson")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    //写一个手机号脱敏的java
    @GetMapping
    //因为脱敏的目的主要是在数据返回时进行，所以做了一个查询
    public Rsp findAll() {
        Rsp r = new Rsp();
        try {
            List<Person> list = phoneService.findAll();
            r.setCode("1");
            r.setMsg("成功");
            r.setData(list);
        } catch (Exception e) {
            //统一错误处理，并进行错误日志打印
        }
        return r;
    }

}
