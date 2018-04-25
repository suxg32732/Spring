package com.spring.aop.calculator;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Logging {
	
	@Before("execution(* com.spring.aop.calculator.CalculatorImpl.*(int, int))")
	public void beforMethod(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		
		System.out.println(name + " --> " + Arrays.toString(args));
	}

}
