package com.chichi.market.controller.pages.front;

import com.chichi.market.dao.UserDao;
import com.chichi.market.dto.UserDto;
import com.chichi.market.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class RegisterController {

    @Autowired
    UserDao userDao;

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") User user,
                               BindingResult result,
                               Model model){

        System.out.println(user.getPhone());

        User existingUser = userDao.selectUserByPhone(user.getPhone());

        if(existingUser != null && existingUser.getPhone() != null && !existingUser.getPhone().isEmpty()){
            result.rejectValue("phone", null,
                    "There is already an account registered with the same phone");
        }

        if(result.hasErrors()){
            model.addAttribute("user", user);
            return "/pages/front/login/registerPage";
        }

        Date date = new Date();

        User user1 = new User();
        user1.setPhone(user.getPhone());
        user1.setPassword(user.getPassword());
        user1.setRealName("testRealName");
        user1.setNickName("testNickName");
        user1.setLastLoginIp("1111");
        user1.setLastLoginTime(date);
        user1.setUserId(4);

        userDao.insert(user1);
        return "redirect:/register?success";
    }

}
