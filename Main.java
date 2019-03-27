import javax.swing.SwingUtilities;
public class Main {
	
	//SwingUtilities.invokeLater used because of displaying menu delay (event dispatcher thread)
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){  
			public void run(){
			new TicTacToeGUI();
		}
	});
	}
}