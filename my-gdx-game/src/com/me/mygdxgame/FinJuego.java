package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class FinJuego extends Image {
	Image Fin;
		public FinJuego()
		{
			super(new Texture("data/Fin.png"));
			this.addListener((EventListener)(this));
			
		}
	}


