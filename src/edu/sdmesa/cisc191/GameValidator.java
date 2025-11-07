/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle; student ID
*
* Other Contributors:
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
*
* Version: 2025-10-28
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of GameValidator is to check the state of the board
 */
public class GameValidator
{
	Board board; //GameValidator has-a relationship with Board
	
	//checks for every possible outcome (win, draw, or ongoing)
	public String check(Board board)
	{
		//every time check is run the grid will be an updated version
		char[][] grid = board.getGrid();
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
