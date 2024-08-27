package com.wipro.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext1.xml");
		Player player1=(Player) context.getBean("player1");
		Player player2=(Player) context.getBean("player2");
		Player player3=(Player) context.getBean("player3");
		Player player4=(Player) context.getBean("player4");
		Player player5=(Player) context.getBean("player5");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		System.out.println(player5);
	}

}
