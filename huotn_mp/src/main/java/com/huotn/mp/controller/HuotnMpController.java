package com.huotn.mp.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author:leichengyang
 * @desc:com.huotn.controller
 * @date:2020-04-17
 */
@RestController
@RequestMapping("/mpController")
public class HuotnMpController {

    //测试公众号的appid和secret
    public static String appid = "wx33b47be9ae79a1f8";
    public static String secret = "3dd1eb9e7f826af839049c5f09d8bd7f";

    @RequestMapping("/getMenuList")
    public String getMenuList(@RequestBody Map<String, Object> map) {
        return "菜单List获取成功";
    }

    public static void main(String[] args) {
        String accessToken = getAccessToken();
        System.out.println(accessToken);
    }


    /**
     * 获取access_token
     *
     * @return
     */
    public static String getAccessToken() {
        RestTemplate restTemplate = new RestTemplate();
        //获取token
        String getTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appid + "&secret=" + secret;
        String result = restTemplate.getForObject(getTokenUrl, String.class);
        JSONObject jsonObject = JSONObject.parseObject(result);
        Object access_token = jsonObject.get("access_token");
        if (!StringUtils.isEmpty(access_token)) {
            String accessToken = access_token.toString();
            return accessToken;
        }
        return null;
    }


    /**
     * 获取openid
     *
     * @param accessToken
     * @return
     */
    public static Object getOpenid(String accessToken) {
        RestTemplate restTemplate = new RestTemplate();
        //获取关注公众号的openid列表
        String getOpenIdUrl = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=" + accessToken + "&next_openid=";
        String openIdResult = restTemplate.getForObject(getOpenIdUrl, String.class);
        JSONObject parseObject = JSONObject.parseObject(openIdResult);
        Object data = parseObject.get("data");

        return data;
    }

    /**
     * 创建菜单
     * @param accessToken
     * @param menu
     * @return
     */
    public boolean createMenu(String accessToken,String menu){
        RestTemplate restTemplate = new RestTemplate();
        String createMenuUrl = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=" + accessToken;
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<>();
        paramMap.add("body ", menu);
        String menuResult = restTemplate.postForObject(createMenuUrl,paramMap,String.class);
        JSONObject parseObject = JSONObject.parseObject(menuResult);
        Object errcode = parseObject.get("errcode");
        if ("0".equals(errcode)){
            return true;
        }
        return false;
    }




}
