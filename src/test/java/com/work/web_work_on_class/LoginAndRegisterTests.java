package com.work.web_work_on_class;

import com.work.web_work_on_class.controller.LoginAndRegisterController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginAndRegisterTests {

    /**
     * 测试目标：Login AND Register
     */
    @Autowired
    private LoginAndRegisterController loginAndRegisterController;

    /**
     * 测试登录
     * 测试用例：tel：19999  email:test@yeah.net username:test password:test
     */
    @Test
    public void testRegister(){
        loginAndRegisterController.register("19999","test@yeah.net","test","test");
    }
}
