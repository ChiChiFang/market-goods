package com.chichi.market.controller;

import com.chichi.market.dao.UserDao;
import com.chichi.market.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/")
    String index() {
        return "index";
    }
}
