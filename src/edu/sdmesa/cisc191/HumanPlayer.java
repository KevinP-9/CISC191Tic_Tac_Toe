/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle Khaliqi; student ID
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
 * Purpose: The responsibility of HumanPlayer is to be a human player for TicTacToe 
 */
//HumanPlayer is player
public class HumanPlayer implements Player
{
	private char mark; //HumanPlayer has-a mark
	Move move; //HumanPlayer has-a move
	
	//constructor that sets a player's mark
	public HumanPlayer(char mark)
	{
		this.mark = mark;
	}

	//returns move
	@Override
	public Move getMove(Board board)
	{
		return move;
	}
	
	//sets move
	public void setMove(Move move)
	{
		this.move = move;
	}
	
	//returns mark
	@Override
	public char getMark()
	{
		return mark;
	}
	
	
}
