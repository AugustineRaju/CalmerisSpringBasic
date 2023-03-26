package com.calmeris.springlearning.scope;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class Dependency1{
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
		
		System.out.println(context.getBean(Dependency1.class));
		System.out.println(context.getBean(Dependency1.class));
		System.out.println(context.getBean(Dependency2.class));
		System.out.println(context.getBean(Dependency2.class));
		
	}

}
