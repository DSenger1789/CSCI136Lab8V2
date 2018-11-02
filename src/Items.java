//Wit Sampson
// Data Created: 10/19/2018
//The purpose of this class is to be able to add the items to the main game that the player will be attempting to collect
public class Items {
	String itemName;
	String imagePath;
	int x;
	int y;
	
	public Items(String imagePath, int x, int y) {
		this.itemName = "item";
		this.imagePath= imagePath;
		this.x = x;
		this.y = y;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
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
	
	
}