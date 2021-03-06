package edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders.actors;

import java.awt.image.BufferedImage;

import edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders.GameImage;

abstract public class Actor extends GameImage {

	private int vy;
	private int vx;
	
	public Actor(BufferedImage image, int x, int y) {
		super(image, x, y);
		// TODO Auto-generated constructor stub

	}

	public Actor(BufferedImage image, int x, int y, int xLimit, int yLimit) {
		super(image, x, y, xLimit, yLimit);
		// TODO Auto-generated constructor stub
	}

	public void setVy(int vy) {
		this.vy = vy;
	}

	public void setVx(int vx) {
		this.vx = vx;
	}
	
	public int getVy() {
		return vy;
	}

	public int getVx() {
		return vx;
	}

	abstract public void executeBehaviour();
	
	

}
