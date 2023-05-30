package com.example.controller;

import com.example.Service.DeptService;
import com.example.Service.impl.DeptServiceimpl;
import com.example.proj.Dept;
import com.example.proj.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 罗霖荃
 * @version 1.0
 */
@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

//    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部dept信息");
        List<Dept> depts = deptService.list();
       return Result.success(depts);
    }
}
