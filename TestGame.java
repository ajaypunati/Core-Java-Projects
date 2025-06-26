package com.Vcube;

import java.util.Scanner;

public class TestGame {
    static char[][] ch= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    static char cplayer='X';
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			PrintBoard();
			System.out.println("select your row:");
			int r = sc.nextInt();
			System.out.println("select your column:");
			int c = sc.nextInt();
			//corner case
			if (r < 0 || r > 2 || c < 0 || c > 2 || ch[r][c] != ' ') {
				System.out.println("Invalid Move!!!!");
				continue;
			}
			ch[r][c] = cplayer;
			if (isWin()) {
				PrintBoard();
				System.out.println(cplayer + ":congratulations you won the match");
				break;
			}
			if (isDraw()) {
				PrintBoard();
				System.out.println("The game is draw ... Thanks for playing!!!!");
				break;
			}
			cplayer = ((cplayer == 'X') ? 'O' : 'X');
		}

	}
	//Printing the Board
	public  static void PrintBoard()
	{
		System.out.println("----------");
		for(char c1[]:ch)
		{
			System.out.print("|");
			for(char c2:c1)
			{
				System.out.print(c2+" |");
			}
			System.out.println();
			System.out.println("----------");
		}
	}
	//IsWin
	public static boolean isWin()
	{
		//Horizontally
		for(int i=0;i<=2;i++)
		{
			if(ch[i][0]== cplayer && ch[i][1]==cplayer && ch[i][2]==cplayer)
			{
			    return true;
			}
		}
		
		//vertically
		for(int j=0;j<=2;j++)
		{
			if(ch[0][j]== cplayer && ch[1][j]==cplayer && ch[2][j]==cplayer)
			{
			    return true;
			}
		}
		
		//Right Diagonal
		if(ch[0][0]==cplayer && ch[1][1]==cplayer && ch[2][2]==cplayer)
		{
			return true;
		}
		
		//left diagnol
		if(ch[0][2]==cplayer && ch[1][1]==cplayer && ch[2][0]==cplayer)
		{
			return true;
		}
		return false;
		
	}
	//Draw situation
	public static boolean isDraw()
	{
		for(int i=0;i<=2;i++)//rows
		{
			for(int j=0;j<=2;j++)//columns
			{
				if(ch[i][j]==' ')
				{
					return false;
				}
			}
		}
		return true;
	}

}
