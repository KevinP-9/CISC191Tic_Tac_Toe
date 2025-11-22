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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Purpose: The responsibility of TicTacToeGUI is to display 
 * all the buttons and things the user will see on the screen
 * (what the user views and interacts with)
 *
 * TicTacToeGUI is-a JFrame
 * TicTacToeGUI is a ...
 */
public class TicTacToeGUI extends JFrame{

	//Displays the 3x3 grid buttons on the screen for user to interact with
	private MarkButton[][] buttons = new MarkButton[3][3];
	private Game game; //TicTacToeGUI has-a game
	private Board board; //TicTacToeGUI has-a board
	private Move move; //TicTacToeGUI has-many moves
	
	public TicTacToeGUI() {
		//Main frame setup
		String[] options = {"Human vs Human", "Human vs AI"}; //options that will be used for our option pane
		//creates an option pane where the user picks whether they will go against a human or ai player
		int mode = JOptionPane.showOptionDialog(this, "Choose game mode: ", "Game Setup", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		board = new Board(); //new board instance
		Player playerX = new HumanPlayer('X'); //Player X is always a human player
		Player playerO;
		//if human player option is selected then Player O will be a human player, else it will be an AIPlayer
		if(mode == 0)
		{
			playerO = new HumanPlayer('O');
		}
		else
		{
			playerO = new AIPlayer('O');
		}
		
		this.game = new Game(board, playerX, playerO); //creates a game instance using the board and players
		//Frame Setup
		this.setTitle("Tic Tac Toe Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);
		this.setLayout(new BorderLayout());
		
		//want Title of the game: "Tic Tac Toe" at the top of the Border Layout
		//create JPanel to hold the title and JLabel to display the title
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("Tic Tac Toe");

		titleLabel.setFont(new Font("Arial", Font.BOLD, 48));
		titlePanel.add(titleLabel);
		//set title at the top (North) of the game layout
		this.add(titlePanel, BorderLayout.NORTH);
		
		//Tic Tac Toe 3x3 grid
		//grid layout in the center holds 3 rows, 3 columns
		//create JPanel to hold and organize buttons
		//GridLayout to display buttons in grid format
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
               
            	buttons[row][col] = new MarkButton(row, col, game); // empty for now, will have X or O behind each button
                buttons[row][col].setFont(new Font("Arial", Font.BOLD, 60));
                buttonPanel.add(buttons[row][col]);
                
            }
            
        }
        
		//want tic tac toe grid in the center of the layout
        this.add(buttonPanel, BorderLayout.CENTER);
        
        //south panel that will have its own border layout so we can put the button above the label
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        
        //create panel for move history button and its button
        JPanel moveHistoryPanel = new JPanel();
        JButton moveHistoryButton = new JButton("Move History");
        moveHistoryButton.setPreferredSize(new Dimension(250, 35));
        //moveHistoryButton action listener which creates, writes, and opens the file
        moveHistoryButton.addActionListener(e -> {
        	game.MoveHistoryFile();
        	});
        moveHistoryPanel.add(moveHistoryButton);
        
        //create panel for names, programmers of the game
        JPanel namesPanel = new JPanel();
        JLabel namesLabel = new JLabel("Programmed by: Michelle K. and Kevin P.");
        namesLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        namesPanel.add(namesLabel);
        
        southPanel.add(moveHistoryPanel, BorderLayout.NORTH);
        southPanel.add(namesPanel, BorderLayout.SOUTH);
		//want names on the bottom (South) of the layout
        this.add(southPanel, BorderLayout.SOUTH);

        this.setVisible(true);
        
	}
	
    public static void main(String[] args) {
        new TicTacToeGUI();
    }
}

