package com.calmeris.springlearning.lazy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class A{
	
}
@Component
@Lazy
class B{
	private  A obj;
	public B(A a) {
		System.out.println("inside");
		obj=a;
	}
}


@Configuration
@ComponentScan
public class LazyInitialisation {
	
	public static void main(String[] args) {
		
		var context= new AnnotationConfigApplicationContext(LazyInitialisation.class);
		//System.out.println("dddd");
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("dddd");
		System.out.println(context.getBean(B.class));
		
	}

}