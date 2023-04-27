import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LibrarianLog {

	public JFrame LibLog;
	private JTextField LibUser;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianLog window = new LibrarianLog();
					window.LibLog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LibrarianLog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LibLog = new JFrame();
		LibLog.setBounds(1100, 100, 576, 341);
		LibLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibLog.getContentPane().setLayout(null);
		
		JLabel lblLibLog = new JLabel("LIBRARIAN LOGIN");
		lblLibLog.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblLibLog.setBounds(176, 43, 198, 21);
		LibLog.getContentPane().add(lblLibLog);
		
		JLabel lblLibUser = new JLabel("Username");
		lblLibUser.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblLibUser.setBounds(120, 123, 76, 19);
		LibLog.getContentPane().add(lblLibUser);
		
		LibUser = new JTextField();
		LibUser.setColumns(10);
		LibUser.setBounds(201, 115, 148, 36);
		LibLog.getContentPane().add(LibUser);
		
		JLabel lblLibPass = new JLabel("Password");
		lblLibPass.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblLibPass.setBounds(120, 183, 76, 19);
		LibLog.getContentPane().add(lblLibPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 175, 148, 36);
		LibLog.getContentPane().add(passwordField);
		
		//Librarian Login Button
		JButton btnLibLog = new JButton("Login");
		
		btnLibLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = LibUser.getText();
				String password = passwordField.getText();
				
				if (username.contains("Librarian_01")&& password.contains("LibOne")) {
					LibUser.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					
					LibrarianLogPrompt llp = new LibrarianLogPrompt();
					llp.LibPrompt.setVisible(true);
					LibLog.dispose();
					
				} else if (username.contains("Librarian_02")&& password.contains("LibTwo")) {
					LibUser.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					
					LibrarianLogPrompt llp = new LibrarianLogPrompt();
					llp.LibPrompt.setVisible(true);
					LibLog.dispose();
					
				} else if (username.contains("Librarian_03")&& password.contains("LibThree")) {
					LibUser.setText(null);
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					
					LibrarianLogPrompt llp = new LibrarianLogPrompt();
					llp.LibPrompt.setVisible(true);
					LibLog.dispose();
					
				 } else if (LibUser.getText() != username && passwordField.getText() != password) {
				
				      JOptionPane.showMessageDialog(null,"Invalid login credentials", "Login Error", JOptionPane.ERROR_MESSAGE);
				
			         }
                                   else 
				 {
				      JOptionPane.showMessageDialog(null,"Account doesn't exist", "Login Error", JOptionPane.ERROR_MESSAGE);
				 }
			}
		});
		btnLibLog.setBounds(294, 257, 117, 29);
		LibLog.getContentPane().add(btnLibLog);
		
		//Exit button going back to the Login Frame		
		JButton btnBack = new JButton("Exit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn bck = new LogIn();
				bck.frame1.setVisible(true);
				LibLog.dispose();
			}
		});
		btnBack.setBounds(139, 257, 117, 29);
		LibLog.getContentPane().add(btnBack);
		
	}

}
