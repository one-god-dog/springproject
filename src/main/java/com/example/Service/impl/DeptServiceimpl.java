package com.example.Service.impl;

import com.example.Service.DeptService;
import com.example.mapper.DeptMapper;
import com.example.proj.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 罗霖荃
 * @version 1.0
 */
@Service
public class DeptServiceimpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
