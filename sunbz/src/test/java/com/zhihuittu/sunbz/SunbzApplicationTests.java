package com.zhihuittu.sunbz;

import com.zhihuittu.sunbz.entity.Person;
import com.zhihuittu.sunbz.mapper.PhoneMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SunbzApplicationTests {

    @Autowired
    private PhoneMapper phoneMapper;
    @Test
    void contextLoads() {
        List<Person> all = phoneMapper.findAll();
        System.out.println(all);
    }

}
