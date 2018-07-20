package com.stang.example.controller.test;

import com.stang.example.entity.test.WechatEntity;
import com.stang.example.service.test.IWechatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 梅谢兵
 * @version V1.0
 * @Title: TestController
 * @Package com.stang.example.controller.test
 * @Description:
 * @date 7/20/18
 */
@Controller
public class TestController {
    @Resource
    IWechatService wechatService;

    @ResponseBody
    @RequestMapping(value = "getJson")
    public WechatEntity getJsonTest(String id){
        return wechatService.getWechatInfo(id);
    }


    @RequestMapping(value = "getHtml")
    public String getHtml(Model model){
        System.out.println("-----------------------");
        model.addAttribute("key","value");
        return "test/index";
    }

}
