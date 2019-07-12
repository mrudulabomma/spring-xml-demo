package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {

        BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/beans.xml"));
        Movie m=(Movie)factory.getBean("movie");
        m.displayInfo();
       BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/beans.xml"));
        Movie m1 = ((DefaultListableBeanFactory) beanFactory).getBean(Movie.class);
       m1.displayInfo();
      ApplicationContext context=new ClassPathXmlApplicationContext("file:src/beans.xml");
       Movie m2=(Movie)context.getBean("movie");
       m2.displayInfo();


    }
}
