package com.calmeris.springlearning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GamRunner {
	
	GameConsole game;

	public GamRunner(@Qualifier("super") GameConsole game) {
		this.game=game;
	}

	public void run() {
		System.out.println("RUnning Pokomon game");
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
