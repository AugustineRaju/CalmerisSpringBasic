package com.calmeris.springlearning.dataservice;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalcluationService {
	
	public BusinessCalcluationService(@Qualifier("MySQLDBService") DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}
	
	
	private DataService dataservice;
	
	
	public int findMax() {
		
		return Arrays.stream((dataservice).retrieveData()).max().orElse(0);
		
	}

}
