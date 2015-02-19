package com.tiarsoft.flappybasico;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Flappy Bird";
		cfg.width = 480;
		cfg.height = 800;
		 cfg.addIcon("data/icono.png", Files.FileType.Internal);

		new LwjglApplication(new MainFlappyBird(), cfg);
	}
}
