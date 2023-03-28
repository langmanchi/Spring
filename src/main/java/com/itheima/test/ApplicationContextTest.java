package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
    public static void main(String[] args) {

        //指定环境
        //System.setProperty("spring.profiles.active","test");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
   //   UserService userService = (UserService) applicationContext.getBean("userService1");//beanName
  //    System.out.println(userService);
        UserDao userDao = (UserDao) applicationContext.getBean("yyy");
        System.out.println(userDao);
        //userService.show();
    }
}
