package edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders.actors.Actor;
import edu.mondragon.eps.jaagirre.game.desktop.tdd.spaceinvaders.actors.Player;



public class Game  {
	
	private int width;
	private int height;
	
	private JFrame window;
	private JPanel panel;
	private Canvas board;
	private GameLogic gameLogic;
	private HashMap<String,BufferedImage> sprites;
	
	
	
	
	public Game(int height, int width, Canvas board){
		this.height = height;
		this.width = width;
		this.gameLogic = new GameLogic();
		this.board = board;
		this.sprites = new HashMap<String,BufferedImage>();
	
	}
	
	public void startGameThread(){
		
	} 
	


	private BufferedImage loadImage(String nombre) {
	        URL url=null;
	        try {
	          url = getClass().getClassLoader().getResource(nombre);
	          return ImageIO.read(url);
	        } catch (Exception e) {
	          System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
	          System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
	          return null;
	        }
	 }
	
	public void addSprite(String key , String  nombre){
		 BufferedImage img = (BufferedImage)sprites.get(nombre);
	        if (img == null) {
	          img = loadImage("res/"+nombre);
	          if (img != null){
	        	  sprites.put(key,img);
	          }
	        }
	 }
	
	public int getSpritesNumber(){
		return sprites.size();
	}
	
	public BufferedImage getSprite(String  key){
		 BufferedImage img = (BufferedImage)sprites.get(key);
	     return img;
	}
	public void addActor(Actor actor){
		gameLogic.addActor(actor);
	}
	
	public void setPlayer(Player player){
		gameLogic.setPlayer(player);
	}
		
	public void initWindow(){
		
		
		board.setBounds(0,0,width, height);
	    
		window = new JFrame("SpaceInvaders");
		window.setBounds( 100,100,width, height );
		panel = (JPanel)window.getContentPane();
		panel.setPreferredSize(new Dimension( this.width, this.height));
	    panel.setLayout(null);
	    panel.add(board);
		
	    
	   
	}

	public void update(){
		gameLogic.update();
	}
	
	public void openWindow(){
		 window.setVisible(true);
	}
	
	


	public void closeWindow(){
		this.window.dispose();
	}


	
	
	public int getWidth() {
		return width;
	}


	
	
	


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	


	public JFrame getWindow() {
		return window;
	}


	


	public JPanel getPanel() {
		return panel;
	}


	


	public Canvas getBoard() {
		return board;
	}

	public GameLogic getGameLogic() {
		return gameLogic;
	}


	


}	