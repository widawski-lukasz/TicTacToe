import javax.swing.JFrame;
import java.awt.Container; 
import javax.swing.JButton;  
import java.awt.GridLayout;
import javax.swing.WindowConstants;
//import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import java.awt.Font;

public class TicTacToeGUI extends JFrame {

	private Container pane;
	private String currentPlayer;
	private JButton [][] board;
	private boolean hasWinner;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem quit;
	private JMenuItem newGame;
	
	public TicTacToeGUI(){
		super();
		pane = getContentPane();
		pane.setLayout(new GridLayout(3,3));
		setTitle("Tic Tac Toe");
		setResizable(false);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		currentPlayer = "x";
		board = new JButton[3][3];
		hasWinner = false;
		initializeBoard();
		initializeMenuBar();
	}
	
	private void initializeMenuBar(){
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		
		newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			resetBoard();
		}
		});
			
		quit = new JMenuItem("Quit");
		quit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		menu.add(newGame);
		menu.add(quit);
		menuBar.add(menu);
		setJMenuBar(menuBar);
				
	}
	
	private void resetBoard(){
		currentPlayer = "x";
		hasWinner = false;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				board[i][j].setText("");
			}
		}
	}
	
	private void initializeBoard(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				JButton btn = new JButton();
				btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD,30));
				board[i][j] = btn;
				btn.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent e){
						if(((JButton)e.getSource()).getText().equals("") && hasWinner == false) { //e.getSource <-returns clicked button
							btn.setText(currentPlayer);
							hasWinner();
							togglePlayer();
						}
						}
				});
				pane.add(btn);
				}	
			}
	}
	
	
	private void togglePlayer(){
		if(currentPlayer.equals("x"))
			currentPlayer = "o";
		else
			currentPlayer = "x";
	}
	
	private void hasWinner(){
		if (board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		else if (board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		else if (board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		else if (board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		else if (board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		else if (board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		else if (board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
			else if (board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)){
			JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " is winner");
			hasWinner = true;
		}
		
	}
	
}
	
	
	

	
	
	
	