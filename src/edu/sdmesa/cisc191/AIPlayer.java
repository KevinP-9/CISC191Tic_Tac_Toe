/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle Khaliqi; student ID
*
* Other Contributors:
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
 * Purpose: The responsibility of AIPlayer is ...
 *
 * AIPlayer is-a ...
 * AIPlayer is ...
 */
public class AIPlayer implements Player
{
	private Move move;
	private char mark;
	
	/**
	 * Purpose: 
	 * @param c
	 */
	public AIPlayer(char c)
	{
		this.mark = c;
	}

	@Override
	public Move getMove(Board board)
	{
		return this.move;
	}

	@Override
	public char getMark()
	{
		return 'O';
	}
	
}
