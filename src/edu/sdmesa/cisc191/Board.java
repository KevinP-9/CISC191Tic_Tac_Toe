/**
* Lead Author(s):
* @author kevin; student ID
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
* <<Add more references here>>
*
* Version: 2025-10-28
*/
package edu.sdmesa.cisc191;
import java.util.LinkedList;

/**
 * Purpose: The responsibility of Board is to be a 3x3 grid for Tic-Tac-Toe
 *
 * Board is-a ...
 * Board is ...
 */
public class Board
{
	private char[][] grid = new char[3][3]; //Board has-a 3x3  grid
	private LinkedList<String> availableMoveList; //Board has-a LinkedList of available moves

	//constructor that fills up the entire grid with an empty space
	public Board() 
	{ 
		//iterates through grid in row-major order
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[row].length; col++)
			{
				//sets each grid cell to an empty space
				grid[row][col] = ' ';
			}
		}
	}
	
	//sets the empty grid value to a player mark
	public void applyMove(Move move, char mark)
	{
		grid[move.getRow()][move.getCol()] = mark;
	}
	
	//iterates through the grid and if a spot is empty then the row and col will be saved into a linked list
	public LinkedList<String> getAvailableMoves()
	{
		//iterates through grid in row-major order
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[row].length; col++)
			{
				//checks to see if a spot is empty
				if(grid[row][col] == ' ')
				{
					//if empty then row and column info will be added as a string to our linked list
					availableMoveList.add("Row: " + row + " , Col: " + col + " ");
				}
			}
		}
		return availableMoveList;
	}
	
	//checks to see if the board is completely full
	public boolean isFull()
	{
		//iterates through grid in row-major order
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[row].length; col++)
			{
				//if a grid cell has a mark then the loop will continue
				if(grid[row][col] == 'X' || grid[row][col] == 'O')
				{
					continue;
				}
				//if grid cell does not contain a mark at any point then false will be returned
				else
				{
					return false;
				}
			}
		}
		//returns true only after the entire grid is checked
		return true;
	}
	
	public void printBoard()
	{
		
	}
	
	//rests the entire board by setting every cell to an empty space
	public void reset()
	{
		//iterates through grid in row-major order
		for(int row = 0; row < grid.length; row++)
		{
			for(int col = 0; col < grid[row].length; col++)
			{
				//sets each grid cell to an empty space
				grid[row][col] = ' ';
			}
		}
	}
	public char[][] getGrid()
	{
		return grid;
	}
}
