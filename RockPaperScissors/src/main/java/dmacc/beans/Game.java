package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {

	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	private void setComputerPlayerToRandom() {
		int computerPick;
		String computerChoice = "";
		
		Random random = new Random();
		
		computerPick = random.nextInt(3)+1;
		if(computerPick == 1) {
			computerChoice = "rock";
		}else if(computerPick == 2) {
			computerChoice = "paper";
		}else if(computerPick == 3){
			computerChoice = "scissors";
		}
		
		this.computerPlayer = computerChoice;
	}

	
	private void determineWinner() {
		String winner = "";
		
		String player1In = this.player1;
		
		//Tie
		if(this.computerPlayer.contentEquals(player1In)) {
			winner = "TIE";
		}
		
		// Rock & Paper
		else if(this.computerPlayer.contentEquals("rock") && player1In.contentEquals("paper")) {
			winner = "- You won -- hooray!";
		}
		else if(this.computerPlayer.contentEquals("paper") && player1In.contentEquals("rock")) {
			winner = "- The computer won! Try again";
		}
		
		//Paper & Scissors
		else if(this.computerPlayer.contentEquals("paper") && player1In.contentEquals("scissors")) {
			winner = "- You won! Go again";
		}
		else if(this.computerPlayer.contentEquals("scissors") && player1In.contentEquals("paper")) {
			winner = "- The computer won! Try again";
		}
		// Rock & scissors
		else if(this.computerPlayer.contentEquals("rock") && player1In.contentEquals("scissors")) {
			winner = "- The computer won! Try again";
		}
		else if(this.computerPlayer.contentEquals("scissors") && player1In.contentEquals("rock")) {
			winner = "- You won! ";
		}
		
		
	
		this.setWinner(winner);
}}


