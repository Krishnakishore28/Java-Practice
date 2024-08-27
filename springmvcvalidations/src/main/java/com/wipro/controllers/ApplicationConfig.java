package com.wipro.controllers;


import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.wipro.controllers.formatters.PhoneNumberFormatter;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages={"com.wipro.controllers","com.wipro.controllers.service"})
public class ApplicationConfig implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	@Override
	public void addFormatters(FormatterRegistry registry) {
		//System.out.println("inside add formatters method");
		registry.addFormatter(new PhoneNumberFormatter());
	}
	@Bean
	public MessageSource messageResource() {
		ResourceBundleMessageSource resourceBundleMessageSource=new ResourceBundleMessageSource();
		resourceBundleMessageSource.setBasename("message");
		return resourceBundleMessageSource;
	}
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean=new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageResource());
		return localValidatorFactoryBean;
		
	}
	@Bean
	public Validator getValidator() {
		return validator();
	}
	@Bean
	public JavaMailSender getMailSender() {
		JavaMailSenderImpl mailSender=new JavaMailSenderImpl();
		mailSender.setHost("smtp.gmail.com");
		mailSender.setUsername("sollumatalu975@gmail.com");
		mailSender.setPassword("Sumanth@975");
		mailSender.setPort(587);
		Properties properties=new Properties();
		properties.put("mail.smtp.starttls.enable",true);
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); 
		mailSender.setJavaMailProperties(properties);
		return mailSender;
	}

}
