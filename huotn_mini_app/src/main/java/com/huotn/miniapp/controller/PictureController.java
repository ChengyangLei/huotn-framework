package com.huotn.miniapp.controller;

import com.huotn.common.HuoResult;
import com.huotn.miniapp.entity.TbPicture;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author:leichengyang
 * @desc:com.huotn.controller
 * @date:2020-04-17
 */
@RestController
@RequestMapping("/api/picture")
public class PictureController {

    @RequestMapping("/getMenuList")
    public String getMenuList(@RequestBody Map<String,Object> map){
        return "菜单List获取成功";
    }



    @RequestMapping("/posts")
    @ResponseBody
    public HuoResult posts(@RequestBody Map<String,Object> map){
        List<TbPicture> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TbPicture tbPicture = new TbPicture();
            tbPicture.setImg_src("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1587975234&di=bb2f6e9b113f9f2c1b2f4125ec80256a&src=http://pic3.16pic.com/00/01/11/16pic_111395_b.jpg");
            tbPicture.setTitle("边框花纹");
            tbPicture.setImg_num(String.valueOf(i));
            list.add(tbPicture);
        }
        return new HuoResult().success(list);
    }

    @RequestMapping("/list")
    @ResponseBody
    public HuoResult list(@RequestBody Map<String,Object> map){
        Object type = map.get("type");
        Object id = map.get("id");
        List<TbPicture> list = new ArrayList<>();
        if (!StringUtils.isEmpty(type)){
            //动物
            if ("1".equals(type)){
                for (int i = 0; i < 10; i++) {
                    TbPicture tbPicture = new TbPicture();
                    tbPicture.setImg_src("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588072191362&di=41f913fd23fa659df8054fc3586e2d14&imgtype=0&src=http%3A%2F%2Fw3.tkgsh.tn.edu.tw%2F97c111%2Fimages%2Fphotos%2Fanimal%2F01.jpg");
                    tbPicture.setTitle("小老虎");
                    tbPicture.setImg_num(String.valueOf(i));
                    list.add(tbPicture);
                }
            }
            //风景
            if ("2".equals(type)){
                for (int i = 0; i < 10; i++) {
                    TbPicture tbPicture = new TbPicture();
                    tbPicture.setImg_src("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588072248442&di=07af50b48af680aa8330533ee2aaf1b3&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-01-17%2F5a5f18f000ece.jpg");
                    tbPicture.setTitle("风景");
                    tbPicture.setImg_num(String.valueOf(i));
                    list.add(tbPicture);
                }
            }
            //建筑
            if ("3".equals(type)){
                for (int i = 0; i < 10; i++) {
                    TbPicture tbPicture = new TbPicture();
                    tbPicture.setImg_src("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588072326560&di=d5f546631bc3f87e007b738d9ca9d557&imgtype=0&src=http%3A%2F%2Fimg1.juimg.com%2F170717%2F330821-1FGG0041349.jpg");
                    tbPicture.setTitle("建筑");
                    tbPicture.setImg_num(String.valueOf(i));
                    list.add(tbPicture);
                }
            }
            //美女
            if ("4".equals(type)){
                for (int i = 0; i < 10; i++) {
                    TbPicture tbPicture = new TbPicture();
                    tbPicture.setImg_src("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588072371909&di=1dc01d3456a2c718d9ac728d39595762&imgtype=0&src=http%3A%2F%2F00.minipic.eastday.com%2F20170509%2F20170509112937_28018c95d006d9861d4992b59463ab5c_6.jpeg");
                    tbPicture.setTitle("美女");
                    tbPicture.setImg_num(String.valueOf(i));
                    list.add(tbPicture);
                }
            }
            //汽车
            if ("5".equals(type)){
                for (int i = 0; i < 10; i++) {
                    TbPicture tbPicture = new TbPicture();
                    tbPicture.setImg_src("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588072403494&di=7a98fe6451c42e8f0492eebe0e2bf252&imgtype=0&src=http%3A%2F%2Fpic29.nipic.com%2F20130522%2F12421584_133951593000_2.jpg");
                    tbPicture.setTitle("汽车");
                    tbPicture.setImg_num(String.valueOf(i));
                    list.add(tbPicture);
                }
            }
            //运动
            if ("6".equals(type)){
                for (int i = 0; i < 10; i++) {
                    TbPicture tbPicture = new TbPicture();
                    tbPicture.setImg_src("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1588072437210&di=25192424b31934cfad1528f907acb950&imgtype=0&src=http%3A%2F%2Fimg01.taopic.com%2F150424%2F240470-1504240U51998.jpg");
                    tbPicture.setTitle("跑步");
                    tbPicture.setImg_num(String.valueOf(i));
                    list.add(tbPicture);
                }
            }
        }

        return new HuoResult().success(list);
    }



    @RequestMapping("/register")
    @ResponseBody
    public HuoResult register(@RequestBody Map<String,Object> map){
        Object username = map.get("username");
        Object password = map.get("password");
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){
        return new HuoResult().success();
        }else{
            return new HuoResult().faild();
        }

    }

}
