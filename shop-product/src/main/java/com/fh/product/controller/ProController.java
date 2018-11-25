package com.fh.product.controller;

import com.fh.product.user.User;
import com.fh.product.util.SendUtilSMS;
import com.fh.product.util.SeverEnum;
import com.fh.product.util.SeverResponse;
import com.google.gson.Gson;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @一句话描述：
 * @作者        ：孙中坤
 * @邮箱        : 279983976@qq.com
 * @创建日期    ：2018年11月10日 20:12
 */
@RestController
@RequestMapping("product")
public class ProController {


    @PostMapping("regUser")
    public SeverResponse regUser(@RequestBody User user){

        Gson gson = new Gson();
        String s = gson.toJson(user);

        return SeverResponse.success(SeverEnum.SECCESS_ENUM);
    }


}
