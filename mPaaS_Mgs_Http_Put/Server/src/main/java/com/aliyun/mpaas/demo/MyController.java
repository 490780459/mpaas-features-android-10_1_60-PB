package com.aliyun.mpaas.demo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
public class MyController {

    @RequestMapping(value="/path_mPaaS_Mgs_Http_Put",method = RequestMethod.PUT,produces = "application/json;charset=UTF-8")
    @ResponseBody
    String api1(@RequestBody User user)
    {
        JSONObject result = new JSONObject();
        result.put("response", "User info received. username:"+ user.name);
        return result.toJSONString();
    }

    public static void main(String[] args)  {
        SpringApplication.run(MyController.class, args);
    }

}
