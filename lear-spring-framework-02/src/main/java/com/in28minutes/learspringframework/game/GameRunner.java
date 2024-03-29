package com.in28minutes.learspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	// private MarioGame game;
	private GamingConsole game;

	public GameRunner(@Autowired @Qualifier("marioGame") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game);

		game.up();
		game.down();
		game.left();
		game.right();
	}

}
