package com.calmeris.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.calmeris.springlearning.game.GameConsole;
import com.calmeris.springlearning.game.GamRunner;

public class SpringAutoWireApp01 {

	public static void main(String[] args) {
		
		
	var context=new AnnotationConfigApplicationContext(GameCOnfigurator.class);
	
	context.getBean(GameConsole.class).up();
	context.getBean(GamRunner.class).run();

	}

}
