package com.spring6.Testxml.Dao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = (UserDao) ac.getBean(UserDao.class);
        userDao.run();
        System.out.println(userDao.getClass());
    }
}
