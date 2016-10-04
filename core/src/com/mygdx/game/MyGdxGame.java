package com.mygdx.game;

import com.badlogic.gdx.Game;


public class MyGdxGame extends Game {
	Nivel nivel;
	@Override
	public void create() {
		nivel = new Nivel();
		setScreen(nivel);
		
	}
	
}
