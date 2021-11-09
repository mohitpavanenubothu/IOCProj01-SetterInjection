package com.springcore.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springcore/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		String result = generator.generateMsg("SATYA");
		System.out.println("Wish Message is:: " + result);
		ctx.close();
	}

}
