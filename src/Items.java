//Wit Sampson & Dustin Senger 
// Data Created: 11/03/2018
//The purpose of this class is to be able to add the items to the main game that the player will be attempting to collect
public class Items {
	private String itemName;
	private String imagePath;
	private int x;
	private int y;
	private boolean appear = true;
	
	public Items(String imagePath, int x, int y, boolean appear) {
		this.itemName = "item";
		this.imagePath= imagePath;
		this.x = x;
		this.y = y;
		this.appear = appear;
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