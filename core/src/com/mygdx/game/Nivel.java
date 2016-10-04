package com.mygdx.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Nivel implements Screen {
	Texture fondo;
	private SpriteBatch batch;
	private OrthographicCamera camara;
    private static final float X_AMPLITUDE = 700;
    private static final float Y_AMPLITUDE = 800;
    private static final float X_CENTER = 1;
    private static final float Y_CENTER = 1;
	
	@Override
	public void show() {
		
	    camara = new OrthographicCamera();
        camara.position.set(X_CENTER, Y_CENTER, 0);
		batch = new SpriteBatch();
		fondo = new Texture("Fondo.png");
		

	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
	    camara.update();
		batch.begin();
		batch.draw(fondo, 0, 0,fondo.getWidth(), fondo.getHeight());
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
	     float aspectRatio = 1.0f * width / height;
        // TODO: Set the camera's viewport height taking into account the ball's movement and radius
        camara.viewportHeight = 2 * (Y_AMPLITUDE);

        // TODO: Set the camera's viewport width to maintain the aspect ratio
        camara.viewportWidth = aspectRatio * camara.viewportHeight;

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
