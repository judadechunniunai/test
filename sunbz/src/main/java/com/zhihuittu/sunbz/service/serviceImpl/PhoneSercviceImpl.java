package com.zhihuittu.sunbz.service.serviceImpl;

import com.zhihuittu.sunbz.entity.Person;
import com.zhihuittu.sunbz.mapper.PhoneMapper;
import com.zhihuittu.sunbz.service.PhoneService;
import com.zhihuittu.sunbz.utils.PhoneUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneSercviceImpl implements PhoneService {
    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public List<Person> findAll() {
        List<Person> list = phoneMapper.findAll();
        for (Person person : list) {
            String tel_phone = person.getTel_phone();
            person.setTel_phone(PhoneUtils.mobilePhone(tel_phone));
        }


        return list;
    }
}
