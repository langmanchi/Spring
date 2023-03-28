package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.UserService;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class UserServiceImpl implements UserService {

    //注入List
//    private List<String> stringList;
//
//    public void setStringList(List<String> stringList){
//        this.stringList = stringList;
//    }
//
//    private List<UserDao> userDaoList;
//
//    public void setUserDaoList(List<UserDao> userDaoList) {
//        this.userDaoList = userDaoList;
//    }

    private UserDao userDao;
    public void show(){
//        System.out.println(stringList);
//        System.out.println(userDaoList);
        System.out.println(userDao);
    }

    //BeanFactory去调用方法 从容器中获得userDao设置到此处
    public void setUserDao(UserDao userDao) {
       this.userDao = userDao;
    }


//    public void init(){
//        System.out.println("初始化方法...");
//    }
//
//    public void destory(){
//        System.out.println("销毁方法....");
//    }
//
//    public UserServiceImpl(){
//        System.out.println("UserServiceImpl无参构造方法执行");
//    }
//
//    public UserServiceImpl(String name){
//        System.out.println("UserServiceImpl有参构造方法执行");
//    }




    //在属性设置之后执行
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet执行");
//    }
}
