package com.chichi.market.controller.pages.front;

import com.chichi.market.dto.UserDto;
import com.chichi.market.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    String loginPage(){
        return "pages/front/login/loginPage";
    }

    @RequestMapping("loginAction")
    String login(User user, Model model){
        if("".equals(user.getPhone()) || user.getPhone()==null){
            model.addAttribute("errorMsg","请输入手机号登录");
            return "pages/front/login/loginPage";
        }
        return "pages/front/login/loginPage";
    }

    @GetMapping("/register")
    String registerPage(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "pages/front/login/registerPage";
    }
}
