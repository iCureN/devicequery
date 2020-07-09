package com.javaboy.devicequery.service;

import com.javaboy.devicequery.mapper.DeviceMapper;
import com.javaboy.devicequery.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired(required = false)
    DeviceMapper deviceMapper;

    public  int insertDevice(Device device){
        return  deviceMapper.insert(device);
    }

    public  int insertSelective(Device device){
        return  deviceMapper.insertSelective(device);
    }
}
