package com.wipro.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.wipro.Configuration.Converters.CreditCardConverters;
import com.wipro.Configuration.Converters.CreditCardToString;
import com.wipro.Configuration.Formatters.CreditCardFormatters;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.wipro.Configuration ")
public class ApplicationConfig implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	public void addFormatters(FormatterRegistry registry) {
//		registry.addFormatter(new CreditCardFormatters());
//		registry.addConverter(new CreditCardConverters());
		registry.addConverter(new CreditCardToString());
		
		
		
	}
	

}
