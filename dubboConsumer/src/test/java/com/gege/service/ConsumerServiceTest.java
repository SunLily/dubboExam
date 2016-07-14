package com.gege.service;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gege.serviceImpl.TestImpl;
import com.gege.serviceImpl.TestServiceImpl;

public class ConsumerServiceTest {
    Logger logger=Logger.getLogger(ConsumerServiceTest.class);
    public static void main(String[] args) throws IOException {
    	/***/
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-customer.xml"});
        context.start();
        ITestService test = (ITestService)context.getBean("demoService");
        System.out.println(test.getName());
        
    	
    	/**
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-customer.xml"});
        context.start();
        System.out.println("启动成功");
        System.in.read(); // 按任意键退出
        */
    }
    
}
