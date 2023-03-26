package com.calmeris.springlearning.dataservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class BusinessDataServiceApp {
	
	public static void main(String[] args) {
		
		var context= new AnnotationConfigApplicationContext(BusinessDataServiceApp.class);
		System.out.println(context.getBean(BusinessCalcluationService.class).findMax());
	}

}
