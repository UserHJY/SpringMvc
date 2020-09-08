package com.hjy.controller;

import com.hjy.model.User;
import com.hjy.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author HJY
 * @date 2020/9/3 10:58
 */
@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/default")
    public ModelAndView selectUser() throws Exception{
        ModelAndView mv = new ModelAndView();
        User user = userService.selectUser(1);
        mv.addObject("user",user);
        mv.setViewName("user");
        return mv;
    }

}
