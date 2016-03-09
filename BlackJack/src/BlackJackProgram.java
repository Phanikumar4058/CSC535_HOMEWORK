import java.util.Random;
import java.util.Scanner;

public class BlackJackProgram {
	String type;
	int currentcard;
	int total =0;
	static int dealerTotal =0;
	static int playerTotal =0;
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
public BlackJackProgram(String Player){
	 type =Player;
		System.out.println("gmae started");
		Deal();
		game();
}
void Deal(){
	System.out.println("first card");
	displayCard();
	System.out.println("Second card");
	displayCard();
	
}

void game()
{
	if(total <= 21)
	{
		if(!(type.equals("dealer")))
		{
			System.out.println("would you like to hit(yes)");
			if(scan.nextLine().equals("yes"))
			{
				displayCard();
				game();
			}
			else
			{
				System.out.println("Your total" + total);
				playerTotal = total;
			}
		}
		
	}
	else
	{
		System.out.println(type + "Busted :" + total);
		//System.out.println("Dealer wins");
		//System.out.exit(0);
	}
	if(type.equals("dealer"))
	{
		if((total <17 && total < 21 ) || total < playerTotal)
		{
			displayCard();
			game();
		}
		else
		{
			dealerTotal = total;
		}
	}
}
void WhoWon()
{
	if(dealerTotal == 0)
	{
		System.out.println("dealer busted");
	}
	if(playerTotal == 0)
	{
		System.out.println("Player Busted");
	}
	if(dealerTotal > playerTotal)
	{
		System.out.println("Dealer won");
	}
	else if(dealerTotal < playerTotal)
	{
		System.out.println("Player Won");
	}
	if(dealerTotal == playerTotal)
	{
		System.out.println("Draw");
	}
}
void displayCard()
{
	 currentcard = ran.nextInt(14);
	 while (currentcard == 0)
	 {
		 currentcard = ran.nextInt(14);
	 }
	 switch (currentcard)
	 {
	 case 1:
		 System.out.println(type + " Draw a jack");
		 total = total + 10;
		 System.out.println(type + "Current Total" +   total);
		 break;
	 case 2 :
		 System.out.println(type + " Draw a queen");
		 total = total + 10;
		 System.out.println(type + "Current Total" +   total);
		 break;
	 case 3 :	 
		 System.out.println(type + " Draw a king");
		 total = total + 10;
		 System.out.println(type + "Current Total" +  + total);
		 break;	
	 case 4:
		 System.out.println(type + " Draw a ace");
		 total = total + 11;
		 System.out.println(type + "Current Total" +  + total);
		 break;
		 default:
			 System.out.println(type + " Draw a" + currentcard);
			 total = total + currentcard;
			 System.out.println(type + "current total" + total);
	 }
}
public static void main(String Args[])
{
	BlackJackProgram Phani = new BlackJackProgram("Phani");
	BlackJackProgram dealer = new BlackJackProgram("dealer");
	Phani.WhoWon();
}
}
