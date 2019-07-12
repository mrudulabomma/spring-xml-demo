package com.stackroute;

import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
        BeanLifeCycleDemo beanLifeCycleDemo=(BeanLifeCycleDemo) context.getBean("cycle");
        BeanPostProcessorDemo bd=(BeanPostProcessorDemo)context.getBean("hel");


    }
}
