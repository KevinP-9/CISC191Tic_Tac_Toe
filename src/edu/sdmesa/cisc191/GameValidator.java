/**
* Lead Author(s):
* @author kevin; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2025-10-28
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The reponsibility of GameValidator is to check the state of the board
 *
 * GameValidator is-a ...
 * GameValidator is ...
 */
public class GameValidator
{
	Board board; //GameValidator has-a relationship with Board
	private char[][] grid = board.getGrid(); //GameValidator has-a copy of our board grid
	
	//checks for every possible outcome (win, draw, or ongoing)
	public String check(Board board)
	{
		//checks all 11 possibilities of X winning
		if((grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X') || (grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X') || (grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X') || 
			(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X') || (grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')	|| (grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X') ||
			(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X') || (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X'))
		{
			return "Player X has won, Player O has lost.";
		}
		//checks all 11 possibilities of O winning
		else if ((grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O') || (grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O') || (grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O') || 
				(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O') || (grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')	|| (grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O') ||
				(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O') || (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O'))
		{
			return "Player O has won, Player X has lost.";
		}
		//if no one has won yet and the board is full then the game must be a draw
		else if(board.isFull())
		{
			return "The game has come to a draw.";
		}
		//if no one has won yet and the board isn't full yet then it must be ongoing
		return "The game is still ongoing.";
	}
}
