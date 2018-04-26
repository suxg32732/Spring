package com.spring.aop.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("calculator.xml");
		Calculator calculator = (CalculatorImpl) ctx.getBean("calculatorImpl");
		int res = calculator.add(1, 2); 
		System.out.println(res);
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
