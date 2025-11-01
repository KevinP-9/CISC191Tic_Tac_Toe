/**
* Lead Author(s):
* @author Kevin Plascencia
* @author Michelle; student ID
*
* Other Contributors:
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* Version: 2025-10-28
*/
package edu.sdmesa.cisc191;

import java.util.LinkedList;
import java.util.Arrays;

/**
 * Purpose: The reponsibility of Game is ...
 *
 * Game is-a ...
 * Game is ...
 */
public class Game
{
	private static Board board;
	private HumanPlayer playerX;
	private HumanPlayer playerO;
	private Player currentPlayer;
	private static GameValidator validator;
	private LinkedList<Move> moveHistory;
	
	public Game(Board gameBoard)
	{
		board = gameBoard;
		validator = new GameValidator();
	}
	
	public void switchPlayer()
	{
		if(currentPlayer == playerX)
		{
			
		}
			
	}
	public static void main(String[] args)
	{
		/* TESTING GAME LOGIC
		Board board = new Board();
		Game game = new Game(board);
		System.out.println(Arrays.deepToString(board.getGrid()));
		System.out.println(game.validator.check(board));
		board.getGrid()[0][0] = 'X';
		board.getGrid()[0][1] = 'X';
		board.getGrid()[0][2] = 'X';
		System.out.println(Arrays.deepToString(board.getGrid()));
		System.out.println(game.validator.check(board));
		*/
	
	}
}
