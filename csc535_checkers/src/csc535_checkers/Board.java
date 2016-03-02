package csc535_checkers;

public class Board {

	private char[][] theBoard;
	public Board()
	{
		this.theBoard = new char[6][7];
		this.BoardConstruction();
		
	}
	private void BoardConstruction()
	{
		for(int i =0;i < this.theBoard.length;i++)
		{
			
			for(int j=0;j<this.theBoard[i].length;j++)
			{
				this.theBoard[i][j]= '_';
				
			}
		}
	}
	public boolean winner()
	{
		boolean row1WinnerA = this.theBoard[0][0] == 'X' && 
				this.theBoard[0][1] == 'X' && 
				this.theBoard[0][2] == 'X';
		boolean row1WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[0][1] == 'O' && 
				this.theBoard[0][2] == 'O';

		boolean row2WinnerA = this.theBoard[1][0] == 'X' && 
				this.theBoard[1][1] == 'X' && 
				this.theBoard[1][2] == 'X';
		boolean row2WinnerB = this.theBoard[1][0] == 'O' && 
				this.theBoard[1][1] == 'O' && 
				this.theBoard[1][2] == 'O';

		boolean row3WinnerA = this.theBoard[2][0] == 'X' && 
				this.theBoard[2][1] == 'X' && 
				this.theBoard[2][2] == 'X';
		boolean row3WinnerB = this.theBoard[0][0] == 'O' && 
				this.theBoard[2][1] == 'O' && 
				this.theBoard[2][2] == 'O';
		
		return row1WinnerA || row1WinnerB || 
				row2WinnerA || row2WinnerB ||
				row3WinnerA || row3WinnerB ;
	}
	public boolean charMove(char move,int row,int col)
	{
		if(this.theBoard[row][col]=='_')
		{
			this.theBoard[row][col]= move;
			return true;
		}
		return false;
	}
		public void display()
		{
			System.out.println("*******************************");
			for(int i =0;i < this.theBoard.length;i++)
			{
				
				for(int j=0;j<this.theBoard[i].length;j++)
				{
					
					System.out.print(this.theBoard[i][j] + "\t");
					
				}
				System.out.println();
			}
		}
	}

