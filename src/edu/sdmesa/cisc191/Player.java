/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
* @author Michelle Khaliqi; student ID
* <<Add additional lead authors here>>
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

/**
 * Purpose: The responsibility of Player is to be an interface for the game players
 */
public interface Player
{
	//returns player move
	public Move getMove(Board board);
	//returns player mark
	public char getMark();
	
}
