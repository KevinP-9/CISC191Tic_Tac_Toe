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
* Version: 2025-10-28
*/
package edu.sdmesa.cisc191;

/**
 * Purpose: The responsibility of Move is to be the moves that the players do
 */
public class Move
{
	private int row; //Move has-a row
	private int col; //Move has-a col
	private char mark; //Move has-a mark
	
	//constructor that sets our instance variables
	public Move(int row, int col, char mark)
	{
		this.row = row;
		this.col = col;
		this.mark = mark;
	}
	
	//returns row
	public int getRow()
	{
		return row;
	}
	
	//returns col
	public int getCol()
	{
		return col;
	}
	
	//sets row
	public void setRow(int row)
	{
		this.row = row; 
	}
	
	//sets col
	public void setCol(int col)
	{
		this.col = col;
	}
	
	//returns mark
	public char getMark()
	{
		return mark;
	}
	
	//toString method that gives info about a move's mark, row, and col
	public String toString()
	{
		return "Player " + mark + " placed their mark on row " + row + " and col " + col + ".";
	}
}
