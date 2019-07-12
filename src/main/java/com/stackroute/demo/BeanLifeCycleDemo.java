package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo implements InitializingBean, DisposableBean {
    public static void main(String [] args){
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");

            ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
    BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo) applicationContext.getBean("lifecycle");





}
    public void Init ()
    {
        System.out.println("Initialization");
    }

    public  void clean()
    {
        System.out.println("custom destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destruction.......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialising.....");
    }
    public void customInit(){
        System.out.println("custom Initialised....");

    }
    public void customDestroy(){
        System.out.println("custom destruction......");

    }
}
