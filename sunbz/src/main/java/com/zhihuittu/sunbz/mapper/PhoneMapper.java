package com.zhihuittu.sunbz.mapper;

import com.zhihuittu.sunbz.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface PhoneMapper{

    @Select("select * from person")
    public List<Person> findAll();


}
