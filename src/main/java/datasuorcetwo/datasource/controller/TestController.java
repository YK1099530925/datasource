package datasuorcetwo.datasource.controller;

import datasuorcetwo.datasource.entity.DeviceSwitch;
import datasuorcetwo.datasource.server.DeviceSwitchServerLocal;
import datasuorcetwo.datasource.server.DeviceSwitchServerProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @Autowired
    DeviceSwitchServerProduct deviceSwitchServerProduct;
    @Autowired
    DeviceSwitchServerLocal deviceSwitchServerLocal;

    @RequestMapping(value = "getProductDeviceSwitchAllByDeviceTypeId")
    @ResponseBody
    public String getProductDeviceSwitchAllByDeviceTypeId(){
        deviceSwitchServerProduct.getMaxId();
        return "生产";
    }

    @RequestMapping(value = "getLocalDeviceSwitchAllByDeviceTypeId")
    @ResponseBody
    public String getLocalDeviceSwitchAllByDeviceTypeId(){
        return "本地";
    }
}
