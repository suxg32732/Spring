package com.spring.aop.calculator;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class Logging {
	
	@Before("getLimit()")
	public void beforMethod(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		
		System.out.println(name + " ----> " + Arrays.toString(args));
	}
	
	@Pointcut("execution(* com.spring.aop.calculator.CalculatorImpl.*(int, int))")
	public void getLimit() {
//		return null;
		System.out.println("cut");
	}

}
