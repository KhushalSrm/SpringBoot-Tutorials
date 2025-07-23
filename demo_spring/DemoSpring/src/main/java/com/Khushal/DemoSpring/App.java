package com.Khushal.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev) context.getBean("dev");
        obj.code();
        //obj.setAge(21); we want spring to set the age, so we will remove ths and modify the spring.xml to set the age
        System.out.println(obj.getAge());
    }

}