/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle Khaliqi; student ID
* 
* Other Contributors: N/A
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	//constructor that sets each MarkButton with its own row, column, empty space, game, and action listener
	public MarkButton(int row, int column, Game game)
	{
		super(" ");
		this.row = row;
		this.column = column;
		this.game = game;
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
		//if MarkButton has an empty space then the current button will be set to the mark of the current player, the movew will be applied to our board, and will switch player turn.
		if(this.getText().equals(" "))
		{
			char mark = game.getCurrentPlayer().getMark();
			this.setText(Character.toString(mark));
			move = new Move(row, column, mark);
			game.getBoard().applyMove(move);
			game.switchPlayer();
		}
		//if it isn't an empty space(meaning it already has a mark) then button will be disabled from being pressed again to avoid turn issues
		else
		{
			this.setEnabled(false);
		}
		
	}
	
}
