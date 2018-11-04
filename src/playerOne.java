//Wit Sampson & Dustin Senger
// Data Created: 11/03/2018
// The purpose of this class is to put the player into the game, the one that is being played by the user
public class playerOne {
	private String playerName;
	private String imagePath;
	private int itemCollected;
	
	
	public playerOne(String playerName,int itemCollected){
		this.playerName = playerName;
		this.itemCollected = itemCollected;
	}
	
	public String getImagePath() {
		return imagePath;
	}

	/*public void Movement() {
		Movement move = new Movement(playerName);
	}
	*/
	public int collectingItems(int itemCollected) {
		return 0;
	}
	
	public String getPlayerName() {
		return playerName;
	}
}