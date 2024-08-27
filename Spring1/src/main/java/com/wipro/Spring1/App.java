package com.wipro.Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
    	Traingle traingle=context.getBean(Traingle.class);
    	Paralleleogram parallelogram=context.getBean(Paralleleogram.class);
    	Rectangle rectangle=context.getBean(Rectangle.class);
    	parallelogram.draw();
    	rectangle.draw();
    	traingle.draw();
    }
}
