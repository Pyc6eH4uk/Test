package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class Attempt1 extends Game {
	PlayScreen playScreen;
	private Stage stage;
	private Texture myTexture;
	private TextureRegion myTextureRegion;
	private TextureRegionDrawable myTexRegionDrawable;
	private ImageButton button;
	//Texture btn;

	@Override
	public void create() {
		this.setScreen(new PlayScreen(this));
	/*
		stage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(stage);
		myTexture = new Texture("playBtn.png");
		myTextureRegion = new TextureRegion(myTexture);
		myTexRegionDrawable = new TextureRegionDrawable(myTextureRegion);

		button = new ImageButton(myTexRegionDrawable);
		button.addListener(new EventListener() {

			@Override
			public boolean handle(Event event) {
				if (button.isPressed()) {
					System.out.println("Is TOUCHED!");
				}
				return false;
			}
		});

		stage.addActor(button);
*/
	}
//		stage = new Stage(new ScreenViewport());
//		Gdx.input.setInputProcessor(stage);
//		btn = new Texture("playBtn.png");
//		Drawable drawable = new TextureRegionDrawable(new TextureRegion(btn));
//		ImageButton button = new ImageButton(drawable);
//	}

	@Override
	public void render() {
		super.render();
		//Gdx.gl.glClearColor(0, 0, 1, 1);
		//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//stage.act();
		//stage.draw();
	}
}
