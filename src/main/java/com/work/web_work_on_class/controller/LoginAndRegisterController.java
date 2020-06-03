package com.work.web_work_on_class.controller;

import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.UserService;
import com.work.web_work_on_class.util.UniversalResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8081","*"})
public class LoginAndRegisterController {
    @Resource
    private UserService userService;

    @PostMapping("/user/new")
    public UniversalResponseBody register(@RequestParam("tel")String tel,
                                          @RequestParam("email")String email,
                                          @RequestParam("username")String username,
                                          @RequestParam("password")String password){
        User record = new User(username,password,email,tel);
        if(userService.addNewUser(record)){
            return new UniversalResponseBody(0,"success");
        }else{
            return new UniversalResponseBody(-1,"error");
        }
    }

    @PostMapping("/user/login")
    public UniversalResponseBody login(@RequestParam("account")String account,
                                       @RequestParam("password")String password,
                                       HttpSession session){
        User data = null;
        //登录检查是否为邮箱登录方法
        if(account.contains("@")){
            data = userService.getUserByEmail(account);
        }else{
            data = userService.getUserByTel(account);
        }
        if(data != null && !data.getUserEmail().equals("") && data.getUserPassword().equals(password)){
            session.setAttribute("auth","user");
            session.setAttribute("userInfo",data);
            return new UniversalResponseBody(0,"success");
        }
        return new UniversalResponseBody(-1,"auth refuse");
    }
}
