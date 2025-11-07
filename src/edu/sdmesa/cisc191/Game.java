/**
* Lead Author(s):
* @author Kevin Plascencia
* @author Michelle Khaliqi; student ID
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
 * Purpose: The responsibility of Game is ...
 *
 * Game is-a ...
 * Game is ...
 */
public class Game
{
	private static Board board; //Game has-a Board
	private Player playerX; //Game has-a player X
	private Player playerO; //Game has-a player O
	private Player currentPlayer; //Game has-a current player
	private static GameValidator validator; //Game has-a GameValidator
	private LinkedList<Move> moveHistory; //Game has-a move history
	
	//constructor that sets the instance variables
	public Game(Board gameBoard, Player playerX, Player playerO)
	{
		board = gameBoard;
		this.playerX = playerX;
		this.playerO = playerO;
		this.currentPlayer = playerX; //first player will always be player X
		validator = new GameValidator();
	}
	
	//if the current player is player X ,then player O will now be the current player
	public void switchPlayer()
	{
		if(currentPlayer == playerX)
		{
			currentPlayer = playerO;
		}
		// if the current player isnt player X, then current player will now be player X
		else 
		{
			currentPlayer = playerX;
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

	//returns the current player
	public Player getCurrentPlayer()
	{
		return currentPlayer;
	}

	//sets the current player
	public void setCurrentPlayer(Player currentPlayer)
	{
		this.currentPlayer = currentPlayer;
	}

	//returns the board
	public Board getBoard()
	{
		// TODO Auto-generated method stub
		return board;
		
	}
}
