package com.calmeris.springlearning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.calmeris.springlearning.game.GamRunner;
import com.calmeris.springlearning.game.GameConsole;
import com.calmeris.springlearning.game.Pokomon;

@Configuration
public class GameCOnfigurator {
	
	@Bean
	public GameConsole game() {
		var game=new Pokomon();
		return game;
	}
	
	@Bean
	public GamRunner gamerunner(@Qualifier("super") GameConsole console) {
		var gamRunner= new GamRunner(console);
		return gamRunner;
	}
	

}
