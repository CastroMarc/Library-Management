import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn {

	public JFrame frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setBounds(100, 100, 576, 341);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblLibManage = new JLabel("LIBRARY MANAGEMENT");
		lblLibManage.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblLibManage.setBounds(144, 43, 265, 21);
		frame1.getContentPane().add(lblLibManage);
		
		//admin login button
		JButton btnAdminLog = new JButton("Admin Login");
		
		btnAdminLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLog adlog = new AdminLog();
				adlog.AdLog.setVisible(true);
				frame1.dispose();
			}
		});
		btnAdminLog.setBounds(191, 106, 168, 50);
		frame1.getContentPane().add(btnAdminLog);
		
		//librarian login button
		JButton btnLibrarLog = new JButton("Librarian Login");
		
		btnLibrarLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLog libLog= new LibrarianLog();
				libLog.LibLog.setVisible(true);
				frame1.dispose();
				
			}
		});
		btnLibrarLog.setBounds(191, 193, 168, 50);
		frame1.getContentPane().add(btnLibrarLog);
	}
}
