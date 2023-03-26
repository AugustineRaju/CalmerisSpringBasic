package com.calmeris.springlearning.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GameConsole {

	public void up() {
		System.out.println("m up");
	}
	public void down() {
		System.out.println("m down");
	}
	public void left() {
		System.out.println("m left");
	}
	public void right() {
		System.out.println("m right");
	}

}
