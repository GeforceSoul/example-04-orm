package com.example.example04orm;

import com.example.example04orm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void buyCarTest() {
        userService.buyCar();
    }

    @Test
    public void addUserTest() {
        userService.addUser();
    }
}