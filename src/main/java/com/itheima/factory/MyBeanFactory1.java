package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class MyBeanFactory1 {
    public static UserDao userDao(){
        //在Bean创建之前可以进行一些其他业务逻辑操作
        return new UserDaoImpl();
    }
}
