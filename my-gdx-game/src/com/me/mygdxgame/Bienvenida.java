package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Bienvenida extends Image {
	Image inicio;
	public Bienvenida()
	{
		super(new Texture("inicio.png"));
		this.addListener(new InputBienvenida(this));
		
	}
}
