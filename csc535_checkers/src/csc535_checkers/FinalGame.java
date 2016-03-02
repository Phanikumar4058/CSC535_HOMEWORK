package csc535_checkers;

import java.util.Scanner;

public class FinalGame {

	private Board theBoard;
	private Player player1;
	private Player player2;
	private Scanner input;
	public FinalGame()
	{
		input = new Scanner(System.in);
		this.theBoard=new Board();
		this.player1= new Player("player1", 'X');
		this.player2 = new Player("player2", '0');
		
	}
	public void play()
	{
		Player currPlayer = this.player1;
		
		do{
		this.theBoard.display();
		this.getMove(currPlayer);
		if(currPlayer == this.player1)
		{
			currPlayer = this.player2;
		}
		else
		{
			currPlayer = this.player1;
		}
		}
		while(this.theBoard.winner() == false);
		if(currPlayer == this.player1)
		{
			System.out.println("The Winner is: " + this.player2.getName());
		}
		else
		{
			System.out.println("The Winner is: " + this.player1.getName());
		}
	}
	public void getMove(Player player)
	{
		int row=move/10-1;
		int col = move%10-1;
		do
		{

			System.out.println("Please enter the col:");
			col = this.input.nextInt();
		}
		while

			(this.theBoard.charMove(player.getMove(), col)==false);
	}
	}
