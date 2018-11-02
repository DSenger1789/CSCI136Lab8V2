//Wit Sampson
// Data Created: 10/19/2018
// The purpose of this class is the display the top scores of the players
public class Game {
	playerOne player;
	enemy enemy1;
	int playerOneScore;
	int enemyScore;
	
	public Game(playerOne player, enemy enemy1,int playerOneScore, int enemyScore) {
		this.player = player;
		this.enemy1 = enemy1;
		this.playerOneScore = playerOneScore;
		this.enemyScore = enemyScore;
		
	}
	
	public int topThreeScore(int playerOneScore, int enemyScore) {
		return 0;
	}
	
	public String toStirng() {
		return "Top 3 Scores: " + topThreeScore(playerOneScore, enemyScore);
	}
	
}