/**
* Lead Author(s):
* @author Kevin Plascencia
* @author Michelle; student ID
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
* Version: 2025-10-28
*/
package edu.sdmesa.cisc191;

import java.util.LinkedList;

/**
 * Purpose: The reponsibility of Game is ...
 *
 * Game is-a ...
 * Game is ...
 */
public class Game
{
	private Board board;
	private Player playerX;
	private Player playerO;
	private Player currentPlayer;
	private GameValidator validator;
	private LinkedList<Move> moveHistory;
	
	public void play()
	{
		new Board();
	}
	
	public void switchPlayer()
	{
		
	}
}
