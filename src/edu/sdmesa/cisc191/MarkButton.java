/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle Khaliqi; 5550132043
* 
* 
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2025-11-06
*/
package edu.sdmesa.cisc191;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Random;
/**
 * Purpose: The responsibility of MarkButton is to be the buttons that our GUI will be using 
 */
//MarkButton is-a JButton
//MarkButton is ActionListener
public class MarkButton extends JButton implements ActionListener
{
	private int row; //MarkButton has-a row
	private int column; //MarkButton has-a column
	private Game game; //MarkButton has-a game
	private Move move; //MarkButton has-a move
	boolean isAi;
	private TicTacToeGUI ui;
	Random random = new Random();
	
	//constructor that sets each MarkButton with its own row, column, empty space, game, and action listener
	public MarkButton(int row, int column, Game game)
	{
		super(" ");
		this.row = row;
		this.column = column;
		this.game = game;
		this.addActionListener(this);
	}
	
	//constructor that sets each MarkButton with its own row, column, empty space, game, and action listener, 
	// and ui which is needed for ai games
	public MarkButton(int row, int column, Game game, TicTacToeGUI ui)
	{
		super(" ");
		this.row = row;
		this.column = column;
		this.game = game;
		this.ui = ui;
		this.addActionListener(this);
	}
	
	//returns row
	public int getRow()
	{
		return this.row;
	}
	
	//returns column
	public int getColumn()
	{
		return this.column;
	}

	//what happens when button is clicked
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//if MarkButton has an empty space then the current button will be set to the mark of the current player, 
		// the move will be applied to our board, and will switch player turn.
		if(this.getText().equals(" "))
		{
			char mark = game.getCurrentPlayer().getMark();
			this.setText(Character.toString(mark));
			move = new Move(row, column, mark);
			game.getBoard().applyMove(move);
			game.addMoveToList(move);
			game.switchPlayer();
			String output = game.getGameValidator().check(game.getBoard());
			if(output.equals("Player X has won, Player O has lost.") && this.game.getIsAIGame()) {
				JOptionPane.showMessageDialog(null, "You beat AI");
				return;
			}
			if(output.equals("The game has come to a draw.")) {
				return;
			}
			if(this.game.getIsAIGame()) {
				mark = game.getCurrentPlayer().getMark();
				LinkedList<String> availableMoves = game.getBoard().getAvailableMoves();
				// get random string from available moves.
				int position = random.nextInt(availableMoves.size());
				// Example string layout is "Row: 0 , Col: 1" so we want the row and column
				// values which are at position 5 and 14.
				int aiRow = availableMoves.get(position).charAt(5) - '0';
				int aiCol = availableMoves.get(position).charAt(14) - '0';
				ui.getButtons()[aiRow][aiCol].setText(Character.toString(mark));
				move = new Move(aiRow, aiCol, mark);
				game.getBoard().applyMove(move);
				game.addMoveToList(move);
				game.switchPlayer();
				output = game.getGameValidator().check(game.getBoard());
				if(output.equals("Player O has won, Player X has lost.") && this.game.getIsAIGame()) {
					JOptionPane.showMessageDialog(null, "You lost to AI");
				}
			}
		}
		//if it isn't an empty space(meaning it already has a mark) then button will be disabled from being pressed again to avoid turn issues
		else
		{
			this.setEnabled(false);
		}
		
	}
	
}
