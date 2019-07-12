package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie=(Movie)applicationContext.getBean("movie");
        Movie movie1=(Movie)applicationContext.getBean("movie1");
        movie.setApplicationContext(applicationContext);
        movie.setBeanName("mudhhuuu");

        System.out.println( movie.getActor());
        System.out.println( movie1.getActor());

        BeanFactory xmlBeanFactory= new XmlBeanFactory( new FileSystemResource("src/beans.xml"));
        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie1");
        Movie moviesecond=(Movie)xmlBeanFactory.getBean("movie1");
        movieFirst.setBeanFactory(xmlBeanFactory);
    }
}
