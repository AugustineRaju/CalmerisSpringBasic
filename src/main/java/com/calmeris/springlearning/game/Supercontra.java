package com.calmeris.springlearning.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("super")
public class Supercontra implements GameConsole {

	public void up() {
		System.out.println("s up");
	}
	public void down() {
		System.out.println("sdown");
	}
	public void left() {
		System.out.println("s left");
	}
	public void right() {
		System.out.println("s right");
	}

}
