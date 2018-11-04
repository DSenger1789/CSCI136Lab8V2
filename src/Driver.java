import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Driver extends Application {
	TextField txt;
	Text text1;
	ImageView myImageView;
	ImageView itemImageView1;
	ImageView itemImageView2;
	ImageView itemImageView3;
	ImageView itemImageView4;
	ImageView itemImageView5;
	ImageView enemyImageView;

	int x = 0, y = 0;
	
	int itemCollected = 0;
	
	Movement move = new Movement (x,y);
	
	Random myRand = new Random();
	int randomX;
	int randomY;
	boolean appear = true;
	
	hitDetection hit = new hitDetection();
	
	Items coin1 = new Items ("file:src/coin.jpg", randomX, randomY, appear);
	Items coin2 = new Items ("file:src/coin.jpg", randomX, randomY, appear);
	Items coin3 = new Items ("file:src/coin.jpg", randomX, randomY, appear);
	Items coin4 = new Items ("file:src/coin.jpg", randomX, randomY, appear);
	Items coin5 = new Items ("file:src/coin.jpg", randomX, randomY, appear);
	
	Text score = new Text ("Points: " + itemCollected);
	
	
	ArrayList items = new ArrayList<Items>();
	
	public void addItem(Items item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		items.add(item);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text("WELCOME TO MY GAME");
		text.setFont(Font.font(40));
		text.setLayoutX(35);
		text.setLayoutY(100);
		
		txt = new TextField("ENTER YOUR NAME");
		txt.setLayoutX(175);
		txt.setLayoutY(350);
		
		Button button = new Button("START GAME");
		button.setLayoutX(200);
		button.setLayoutY(250);
		button.setOnAction(this::startGame);
		
		
		
		
		Group root = new Group(text,button,txt);
		Scene scene = new Scene(root,500,500,Color.WHITE);
		PrimaryStage.setTitle("Game");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}
	
	public void startGame(ActionEvent args) {
		
		Image image1 = new Image("file:src/hero.png");
		myImageView = new ImageView(image1);
		myImageView.setFitWidth(50);
		myImageView.setFitHeight(50);
		myImageView.setX(x);
		myImageView.setY(y);
		
		
		
		Image itemImage1 = new Image(coin1.getImagePath(), 50, 50, false, appear);
		Image itemImage2 = new Image(coin2.getImagePath(), 50, 50, false, appear);
		Image itemImage3 = new Image(coin3.getImagePath(), 50, 50, false, appear);
		Image itemImage4 = new Image(coin4.getImagePath(), 50, 50, false, appear);
		Image itemImage5 = new Image(coin5.getImagePath(), 50, 50, false, appear);
		
		Image enemyImage = new Image("file:src/enemy.jpg");
		enemyImageView = new ImageView(enemyImage);
		enemyImageView.setFitHeight(50);
		enemyImageView.setFitWidth(50);
		
		
		itemImageView1 = new ImageView(itemImage1);
		itemImageView1.setFitWidth(25);
		itemImageView1.setFitHeight(25);
		
		itemImageView2 = new ImageView(itemImage2);
		itemImageView2.setFitWidth(25);
		itemImageView2.setFitHeight(25);
		
		itemImageView3 = new ImageView(itemImage3);
		itemImageView3.setFitWidth(25);
		itemImageView3.setFitHeight(25);
		
		itemImageView4 = new ImageView(itemImage4);
		itemImageView4.setFitWidth(25);
		itemImageView4.setFitHeight(25);
		
		itemImageView5 = new ImageView(itemImage5);
		itemImageView5.setFitWidth(25);
		itemImageView5.setFitHeight(25);
		
		randomX = myRand.nextInt(475);
		randomY = myRand.nextInt(475);
		coin1.setX(randomX);
		coin1.setY(randomY);
		items.add(coin1);
		itemImageView1.setX(coin1.getX());
		itemImageView1.setY(coin1.getY());
		
		randomX = myRand.nextInt(475);
		randomY = myRand.nextInt(475);
		coin2.setX(randomX);
		coin2.setY(randomY);
		items.add(coin2);
		itemImageView2.setX(coin2.getX());
		itemImageView2.setY(coin2.getY());
		
		randomX = myRand.nextInt(475);
		randomY = myRand.nextInt(475);
		coin3.setX(randomX);
		coin3.setY(randomY);
		items.add(coin3);
		itemImageView3.setX(coin3.getX());
		itemImageView3.setY(coin3.getY());
		
		randomX = myRand.nextInt(475);
		randomY = myRand.nextInt(475);
		coin4.setX(randomX);
		coin4.setY(randomY);
		items.add(coin4);
		itemImageView4.setX(coin4.getX());
		itemImageView4.setY(coin4.getY());
		
		randomX = myRand.nextInt(475);
		randomY = myRand.nextInt(475);
		coin5.setX(randomX);
		coin5.setY(randomY);
		items.add(coin5);
		itemImageView5.setX(coin5.getX());
		itemImageView5.setY(coin5.getY());
		
		randomX = myRand.nextInt(450);
		randomY = myRand.nextInt(450);
		enemyImageView.setX(randomX);
		enemyImageView.setY(randomY);
		
		//System.out.println(items.toString());
		
		String name = txt.getText();
		
		playerOne pOne = new playerOne(name,itemCollected);
		
		score.setX(0);
		score.setY(0);
		
		
		text1 = new Text();
		text1.setText(pOne.getPlayerName());
		
		
		
		Group root2 = new Group(myImageView,text1,score,enemyImageView, itemImageView1,itemImageView2,itemImageView3,itemImageView4,itemImageView5);
		Scene scene2 = new Scene(root2,500,500,Color.WHITE);
		scene2.setOnKeyPressed(this::listenUp);
		Stage SecondaryStage = new Stage();
		SecondaryStage.setScene(scene2);
		SecondaryStage.show();
	}
	
	public void listenUp(KeyEvent event)
	{
		KeyCode myCode = event.getCode();
		
		if(myCode == KeyCode.A)
		{
			move.setX(x-=10);
			
			
		}
		else if(myCode == KeyCode.D)
		{
			move.setX(x+=10);
			
		}
		else if(myCode == KeyCode.S)
		{
			move.setY(y+=10);
				
		}
		else if(myCode == KeyCode.W)
		{
			move.setY(y-=10);
	
		}
		
		
		myImageView.setX(move.getX());
		myImageView.setY(move.getY());
		text1.setX(move.getX());
		text1.setY(move.getY());
		
		hit.player1TopLeftX = (int)myImageView.getX();
		hit.player1TopLeftY = (int)myImageView.getY();
		hit.player1BottomRightX = (int)myImageView.getX() + 50;
		hit.player1BottomRightY = (int)myImageView.getY() + 50;
		
		
		hit.item1TopLeftX = coin1.getX();
		hit.item1TopLeftY = coin1.getY();
		hit.item1BottomRightX = coin1.getX() + 25;
		hit.item1BottomRightY = coin1.getY() + 25;
		
		hit.item2TopLeftX = coin2.getX();
		hit.item2TopLeftY = coin2.getY();
		hit.item2BottomRightX = coin2.getX() + 25;
		hit.item2BottomRightY = coin2.getY() + 25;
		
		hit.item3TopLeftX = coin3.getX();
		hit.item3TopLeftY = coin3.getY();
		hit.item3BottomRightX = coin3.getX() + 25;
		hit.item3BottomRightY = coin3.getY() + 25;
		
		hit.item4TopLeftX = coin4.getX();
		hit.item4TopLeftY = coin4.getY();
		hit.item4BottomRightX = coin4.getX() + 25;
		hit.item4BottomRightY = coin4.getY() + 25;
		
		hit.item5TopLeftX = coin5.getX();
		hit.item5TopLeftY = coin5.getY();
		hit.item5BottomRightX = coin5.getX() + 25;
		hit.item5BottomRightY = coin5.getY() + 25;
		
		hit.enemy1TopLeftX = (int)enemyImageView.getX();
		hit.enemy1TopLeftY = (int)enemyImageView.getY();
		hit.enemy1BottomRightX = (int)enemyImageView.getX() + 50;
		hit.enemy1BottomRightY = (int)enemyImageView.getY() + 50;
		
		
		if (hit.player1TopLeftX < hit.item1BottomRightX && hit.player1BottomRightX >
		hit.item1TopLeftX&& hit.player1TopLeftY < hit.item1BottomRightY && hit.player1BottomRightY >
		hit.item1TopLeftY) 
		{
		itemImageView1.setImage(null);
		}
		
		if (hit.player1TopLeftX < hit.item2BottomRightX && hit.player1BottomRightX >
		hit.item2TopLeftX&& hit.player1TopLeftY < hit.item2BottomRightY && hit.player1BottomRightY >
		hit.item2TopLeftY) 
		{
		itemImageView2.setImage(null);
		itemCollected = itemCollected + 1;
		}
		
		if (hit.player1TopLeftX < hit.item3BottomRightX && hit.player1BottomRightX >
		hit.item3TopLeftX&& hit.player1TopLeftY < hit.item3BottomRightY && hit.player1BottomRightY >
		hit.item3TopLeftY) 
		{
		itemImageView3.setImage(null);
		itemCollected = itemCollected + 1;
		}
		
		if (hit.player1TopLeftX < hit.item4BottomRightX && hit.player1BottomRightX >
		hit.item4TopLeftX&& hit.player1TopLeftY < hit.item4BottomRightY && hit.player1BottomRightY >
		hit.item4TopLeftY) 
		{
		itemImageView4.setImage(null);
		itemCollected = itemCollected + 1;
		}
		
		if (hit.player1TopLeftX < hit.item5BottomRightX && hit.player1BottomRightX >
		hit.item5TopLeftX&& hit.player1TopLeftY < hit.item5BottomRightY && hit.player1BottomRightY >
		hit.item5TopLeftY) 
		{
		itemImageView5.setImage(null);
		itemCollected = itemCollected + 1;
		}
		
		if (hit.player1TopLeftX < hit.enemy1BottomRightX && hit.player1BottomRightX >
		hit.enemy1TopLeftX&& hit.player1TopLeftY < hit.enemy1BottomRightY && hit.player1BottomRightY >
		hit.enemy1TopLeftY) 
		{
			Text myText1 = new Text();
			Text myText = new Text();
			String answer = "";
			do {
			myText = new Text("GAME OVER");
			myText.setFont(Font.font(40));
			myText.setLayoutX(50);
			myText.setLayoutY(100);
			
			myText1 = new Text("Restart Game? (Y/N)");
			myText1.setLayoutX(50);
			myText1.setLayoutY(200);
			
			txt = new TextField("Y/N");
			txt.setLayoutX(50);
			txt.setLayoutY(300);
			}while(answer.equalsIgnoreCase("Y"));
			
			
			Group root3 = new Group(myText,myText1,txt);
			Scene scene3 = new Scene(root3,500,500,Color.WHITE);
			Stage ThirdStage = new Stage();
			ThirdStage.setScene(scene3);
			ThirdStage.show();
	}
		
		
		
		score.setText("Points: " + itemCollected);
		System.out.println(coin1.getX());
		System.out.println(myImageView.getX());
		System.out.println(score);
		
		if(itemCollected > 35) {
			Text myText1 = new Text();
			Text myText = new Text();
			String answer = "";
			do {
			myText = new Text("GAME OVER");
			myText.setFont(Font.font(40));
			myText.setLayoutX(50);
			myText.setLayoutY(100);
			
			myText1 = new Text("Restart Game? (Y/N)");
			myText1.setLayoutX(50);
			myText1.setLayoutY(200);
			
			txt = new TextField("Y/N");
			txt.setLayoutX(50);
			txt.setLayoutY(300);
			}while(answer.equalsIgnoreCase("Y"));
			
			
			Group root3 = new Group(myText,myText1,txt);
			Scene scene3 = new Scene(root3,500,500,Color.WHITE);
			Stage ThirdStage = new Stage();
			ThirdStage.setScene(scene3);
			ThirdStage.show();
		}
	}
	
	
}