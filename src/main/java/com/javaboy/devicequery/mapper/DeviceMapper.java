package com.javaboy.devicequery.mapper;

import com.javaboy.devicequery.model.Device;

public interface DeviceMapper {
    int insert(Device device);

    int insertSelective (Device device);
}
