package com.javaboy.devicequery.controller;

import com.google.zxing.Result;
import com.javaboy.devicequery.model.Device;
import com.javaboy.devicequery.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.javaboy.devicequery.common.unitl.QRCodeUtil;

import java.util.UUID;

/**
 * 二维码调用前端控制器
 */
@RequestMapping("/Qrcode")
@RestController
public class QrcodeController{

    @Autowired
    DeviceService deviceService;


    /**
     * 生成二维码
     */
    @RequestMapping(value = "/device", method = RequestMethod.POST)
    public String productcode(Device device) {
        UUID uuid= UUID.randomUUID();
        String uuidStr=uuid.toString();
        QRCodeUtil.zxingCodeCreate(uuidStr,"E:/QRcode/",500,"E:/QRcode/101.jpg/");
//        QRCodeUtil.zxingCodeCreate(uuidStr,"/home/QRcode/",500,"/home/101.jpg/");
        device.setUuid(uuidStr);
        deviceService.insertSelective(device);
        System.out.println(device);
        return uuidStr;
    }


    /**
     * 解析二维码
     */
    @GetMapping("/test")
    public String analysiscode() {
        Result result = QRCodeUtil.zxingCodeAnalyze("E:/QRcode/290.jpg/");
        System.err.println("二维码解析内容："+result.toString());
        return result.toString();
    }

}

