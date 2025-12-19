/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle Khaliqi; 5550132043
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
 * Purpose: The responsibility of AIPlayer is to be AI controller in the tic tac toe game
 *
 * AIPlayer is-a Player
 */
public class AIPlayer implements Player
{
	//AIPlayer Has a move and mark
	private Move move;
	private char mark;
	
	/**
	 * Purpose: constructor that will set AIPlayer mark
	 * @param c
	 */
	public AIPlayer(char c)
	{
		this.mark = c;
	}
	
	//returns location where AIPlayer move
	@Override
	public Move getMove(Board board)
	{
		return this.move;
	}
	
	// Returns AIPlayer mark (O)
	@Override
	public char getMark()
	{
		return 'O';
	}
	
}
