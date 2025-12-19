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
import java.awt.Desktop;
import java.io.File;
import java.io.PrintWriter;
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
	private Move buttonMove; //Game has-a relationship with Move
	private boolean isAIGame;
	
	//constructor that sets the instance variables
	public Game(Board gameBoard, Player playerX, Player playerO)
	{
		board = gameBoard;
		this.playerX = playerX;
		this.playerO = playerO;
		this.currentPlayer = playerX; //first player will always be player X
		validator = new GameValidator();
		moveHistory = new LinkedList<>();
		if(playerO instanceof AIPlayer) {
			isAIGame = true;
		}
		else {
			isAIGame = false;
		}
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
	//method that takes in a move and adds its row and col information to our move history
	public void addMoveToList(Move move)
	{
		moveHistory.add(move);
	}
	
	//method that creates a move history text file and writes the game moves inside of it
	public void MoveHistoryFile()
	{
		try
		{
			File file = new File("src/move_history.txt"); //creates file inside of our src folder
			PrintWriter writer = new PrintWriter(file);
			//writes every move in our move history to our file
			for(Move move : moveHistory)
			{
				writer.println(move.toString());
			}
			writer.close();
			//opens the file
			Desktop.getDesktop().open(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		
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
		return board;
		
	}
	//returns the game validator
	public GameValidator getGameValidator() 
	{
		return validator;
	}
	//returns move history
	public LinkedList<Move> getMoveHistory()
	{
		return moveHistory;
	}
	
	//returns if it is an AI game or not
	public boolean getIsAIGame() 
	{
		return isAIGame;
	}
	
	
}
