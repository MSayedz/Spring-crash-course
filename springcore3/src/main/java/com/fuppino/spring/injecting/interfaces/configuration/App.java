package com.fuppino.spring.injecting.interfaces.configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/fuppino/spring/injecting/interfaces/configuration/config.xml");
		
		OrderBO orderBO = (OrderBO)ctx.getBean("orderBO");	
		orderBO.processOrder();	
	}
}
