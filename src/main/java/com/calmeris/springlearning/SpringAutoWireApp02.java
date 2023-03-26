package com.calmeris.springlearning;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.calmeris.springlearning.game.GameConsole;
import com.calmeris.springlearning.game.GamRunner;

@Configuration
@ComponentScan("com.calmeris.springlearning.game")

public class SpringAutoWireApp02 {

	public static void main(String[] args) {
		
		
	var context=new AnnotationConfigApplicationContext(SpringAutoWireApp02.class);
	
	context.getBean(GameConsole.class).up();
	context.getBean(GamRunner.class).run();

	}

}
