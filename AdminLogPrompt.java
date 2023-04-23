import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class AdminLogPromt {

	public JFrame adminPromt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogPromt window = new AdminLogPromt();
					window.adminPromt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogPromt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminPromt = new JFrame();
		adminPromt.setBounds(100, 100, 576, 341);
		adminPromt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminPromt.getContentPane().setLayout(null);
		
		JLabel welcomelbl = new JLabel("WELCOME TO NU LIBRARY SYTEM");
		welcomelbl.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 25));
		welcomelbl.setBounds(72, 88, 437, 102);
		adminPromt.getContentPane().add(welcomelbl);
	}

}
