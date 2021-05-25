package com.bjsxt.test;

import com.bjsxt.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] str = applicationContext.getBeanDefinitionNames();
        for (String arr :str){
            System.out.println(arr);
        }
        UsersService usersService = (UsersService) applicationContext.getBean("usersServiceImpl");
        //System.out.println(usersService);
        usersService.addUsers();
    }
}
