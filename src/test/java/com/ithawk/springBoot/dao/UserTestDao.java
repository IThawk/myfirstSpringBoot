package com.ithawk.springBoot.dao;

import com.itHawk.springBoot.dao.UserMapper;
import com.itHawk.springBoot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTestDao {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void TestSelectUserByUserNameAndPassword(){
        User user =new User("root","123456");
        System.out.println(userMapper.selectByUserNameAndPassWord(user).getId());
    }
}
