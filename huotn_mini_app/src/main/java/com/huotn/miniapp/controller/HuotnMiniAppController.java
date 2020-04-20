package com.huotn.miniapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author:leichengyang
 * @desc:com.huotn.controller
 * @date:2020-04-17
 */
@RestController
@RequestMapping("/huotnMiniAppController")
public class HuotnMiniAppController {

    @RequestMapping("/getMenuList")
    public String getMenuList(@RequestBody Map<String,Object> map){
        return "菜单List获取成功";
    }

}
