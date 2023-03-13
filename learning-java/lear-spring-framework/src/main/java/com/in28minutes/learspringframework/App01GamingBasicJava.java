package com.in28minutes.learspringframework;

import com.in28minutes.learspringframework.game.GameRunner;
import com.in28minutes.learspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

		// var game = new MarioGame();
		// var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
