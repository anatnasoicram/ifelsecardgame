package com.deploy.ligbdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration; 
public class LibgdxGame {

public static void main(String[] args) {
	LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	config.title = "IF-ELSE Card Game";
	config.fullscreen = false;
	config.resizable = false;
	config.width = 1400;
	config.height = 800;
	config.samples = 2;
	config.useGL20 = true;
	new LwjglApplication(new GameRoot(), config);
	}	
}
