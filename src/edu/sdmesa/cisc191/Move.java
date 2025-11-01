/**
* Lead Author(s):
* @author Kevin Plascencia; student ID
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

/**
 * Purpose: The reponsibility of Move is ...
 *
 * Move is-a ...
 * Move is ...
 */
public class Move
{
	private int row; //Move has-a row
	private int col; //Move has-a col
	
	//constructor that sets our instance variables
	public Move(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	
	//getter method for row
	public int getRow()
	{
		return row;
	}
	
	//getter method for col
	public int getCol()
	{
		return col;
	}
}
