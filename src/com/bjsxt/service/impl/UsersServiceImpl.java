package com.bjsxt.service.impl;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 如果在添加注册bean对象的注解中并未指定bean对象的ID
 * 那么springIOC容器会使用该类的名称并且将首字母转换小写作为Bean对象的id
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Value("${jdbc.name}")
    private String name;

    @Autowired
    @Qualifier("suibianDao")
    private UsersDao usersDao;


    /*@Autowired
    public void suibian(UsersDao usersDao){
        this.usersDao = usersDao;
    }*/



    @Override
    public void addUsers() {
        System.out.println("UsersDao :" + this.usersDao + " " + this.name);
    }
}
