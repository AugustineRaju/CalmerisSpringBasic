package com.calmeris.springlearning.game;

import org.springframework.stereotype.Component;

@Component
public class Pokomon implements GameConsole {

	public void up() {
		System.out.println("p up");
	}
	public void down() {
		System.out.println("p down");
	}
	public void left() {
		System.out.println("p left");
	}
	public void right() {
		System.out.println("p right");
	}

}
