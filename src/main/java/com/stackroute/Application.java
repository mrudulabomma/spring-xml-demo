package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        System.out.println( movie.getActor());
        System.out.println( movie1.getActor());

    }
}
