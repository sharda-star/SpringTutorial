package com.xoriant.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Pointcut("execution(* com.beans.Performer.perform(..)) ")
	private void performance() {}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}
	
	@Before("performance()")
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}
	
//	@AfterReturning("performance()")
//	public void applaud() {
//		System.out.println("CLAP CLAP CLAP CLAP CLAP");
//	}
	
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Boo! We want our money back!!!!!");
	}
	
	@After("performance()")
	public void goHome() {
		System.out.println("Audience go home");
	}
	
	@Around("performance()")
	public void applaud(ProceedingJoinPoint proceedingJoinPoint) {
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}
}
