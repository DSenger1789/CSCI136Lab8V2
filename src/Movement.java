import javax.swing.KeyStroke;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

//Wit Sampson & Dustin Senger
// Data Created: 11/03/2018
//The purpose of this class is to give movement to the game
public class Movement {
	private int x;
	private int y;
	private boolean yes = true;
	private boolean no = false;
	public Movement(int x, int y) {
		this.x = x;
		this.y = y;  
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void hitDetected(boolean yes) {
		this.yes = true;
		this.no = false;
	}
	
}