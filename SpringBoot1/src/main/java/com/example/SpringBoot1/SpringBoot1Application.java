package com.example.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringBoot1.Beans.Battery;
import com.example.SpringBoot1.Beans.HardDisk;
import com.example.SpringBoot1.Beans.Laptop;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBoot1Application.class, args);
		Laptop l=context.getBean(Laptop.class);
		Battery b=context.getBean(Battery.class);
		HardDisk h=context.getBean(HardDisk.class);
		h.setId(1);
		h.setName("harddisk");
		b.setId(1);
		b.setName("battery high");
		h.setBattery(b);
		l.setLid(1);
		l.setLname("hp");
		l.setHardDisk(h);
		System.out.println(l);
	}

}
