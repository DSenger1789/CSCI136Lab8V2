
public class hitDetection {

	int player1TopLeftX;
	int player1BottomRightX;
	int player1TopLeftY;
	int player1BottomRightY;
	int item1TopLeftX;
	int item1BottomRightX;
	int item1TopLeftY;
	int item1BottomRightY;
	
	public hitDetection () {
		
	}	
	public int getPlayer1TopLeftX() {
		return player1TopLeftX;
	}


	public void setPlayer1TopLeftX(int player1TopLeftX) {
		this.player1TopLeftX = player1TopLeftX;
	}


	public int getPlayer1BottomRightX() {
		return player1BottomRightX;
	}


	public void setPlayer1BottomRightX(int player1BottomRightX) {
		this.player1BottomRightX = player1BottomRightX;
	}


	public int getPlayer1TopLeftY() {
		return player1TopLeftY;
	}


	public void setPlayer1TopLeftY(int player1TopLeftY) {
		this.player1TopLeftY = player1TopLeftY;
	}


	public int getPlayer1BottomRightY() {
		return player1BottomRightY;
	}


	public void setPlayer1BottomRightY(int player1BottomRightY) {
		this.player1BottomRightY = player1BottomRightY;
	}


	public int getItem1TopLeftX() {
		return item1TopLeftX;
	}


	public void setItem1TopLeftX(int item1TopLeftX) {
		this.item1TopLeftX = item1TopLeftX;
	}


	public int getItem1BottomRightX() {
		return item1BottomRightX;
	}


	public void setItem1BottomRightX(int item1BottomRightX) {
		this.item1BottomRightX = item1BottomRightX;
	}


	public int getItem1TopLeftY() {
		return item1TopLeftY;
	}


	public void setItem1TopLeftY(int item1TopLeftY) {
		this.item1TopLeftY = item1TopLeftY;
	}


	public int getItem1BottomRightY() {
		return item1BottomRightY;
	}


	public void setItem1BottomRightY(int item1BottomRightY) {
		this.item1BottomRightY = item1BottomRightY;
	}


	private boolean areRectsColliding1(int player1TopLeftX, int player1BottomRightX,int player1TopLeftY, 
			int player1BottomRightY,int item1TopLeftX,int item1BottomRightX, int item1TopLeftY, int item1BottomRightY)
			{
			this.player1TopLeftX = player1TopLeftX;
			this.player1BottomRightX = player1BottomRightX;
			this.player1TopLeftY = player1TopLeftY;
			this.player1BottomRightY = player1BottomRightY;
			this.item1TopLeftX = item1TopLeftX;
			this.item1BottomRightX = item1BottomRightX;
			this.item1TopLeftY = item1TopLeftY;
			this.item1BottomRightY = item1BottomRightY;
		
			if (player1TopLeftX < item1BottomRightX && player1BottomRightX >
			item1TopLeftX&& player1TopLeftY < item1BottomRightY && player1BottomRightY >
			item1TopLeftY) 
			{
			return true;
			}
			else
			{
			return false;
			}
			}

}
