package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
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
        BeanFactory xmlBeanFactory= new XmlBeanFactory ( new FileSystemResource("src/beans.xml"));
        Movie movieFirst= (Movie)xmlBeanFactory.getBean("movie1");
        Movie moviesecond=(Movie)xmlBeanFactory.getBean("movie1");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:src/beans.xml");
        Movie movie=(Movie)applicationContext.getBean("movie2");
        Movie movie2=(Movie)applicationContext.getBean("movie2");

        Movie movieB=(Movie)applicationContext.getBean("movieB");


        System.out.println( movieFirst.getActor());
       // moviesecond.getActor();

        System.out.println(  movie.getActor());
      //  movie2.getActor();

        System.out.println(movie==movie2);

        System.out.println(movieFirst==moviesecond);

        System.out.println( movieB.getActor());
    }
}
