package com.calmeris.springlearning.dependency;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class MyBusiness{

	//Field
	@Autowired 
	Dependency1 dp1;
	@Autowired
	Dependency2 dp2;
	
	
	
	//setter
	@Autowired
	public void setDp1(Dependency1 dp1) {
		 System.out.println("sett");
		this.dp1 = dp1;
	}
	@Autowired
	public void setDp2(Dependency2 dp2) {
		this.dp2 = dp2;
	}


	//Constructor
	 public MyBusiness(Dependency1 dp1, Dependency2 dp2) {
		
		super();
		 System.out.println("const");
		this.dp1 = dp1;
		this.dp2 = dp2;
	}
	public String toString() {
		return "this is"+dp1+"and"+dp2;
		 
	 }
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}


@Configuration
@ComponentScan
public class DependencyInjection {
	
	public static void main(String[] args) {
		
		var context= new AnnotationConfigApplicationContext(DependencyInjection.class);
		//System.out.println("dddd");
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		//System.out.println("dddd");
		
		System.out.println(context.getBean(MyBusiness.class));
		
	}

}
