package com.example.mapper;


import com.example.proj.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 罗霖荃
 * @version 1.0
 */
@Mapper
public interface DeptMapper {

    @Select("select * from dept")
    List<Dept> list();
}
