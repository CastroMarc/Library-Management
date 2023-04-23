import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLog {

	public JFrame AdLog;
	private JTextField Usertext;
	private JTextField Passtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLog window = new AdminLog();
					window.AdLog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLog() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdLog = new JFrame();
		AdLog.setBounds(100, 100, 576, 341);
		AdLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdLog.getContentPane().setLayout(null);
		
		JLabel lblAdminLog = new JLabel("ADMIN LOGIN");
		lblAdminLog.setFont(new Font("Lucida Grande", Font.BOLD, 22));
		lblAdminLog.setBounds(198, 36, 155, 36);
		AdLog.getContentPane().add(lblAdminLog);
		
		JLabel lblAdminUser = new JLabel("Username");
		lblAdminUser.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAdminUser.setBounds(120, 118, 76, 19);
		AdLog.getContentPane().add(lblAdminUser);
		
		Usertext = new JTextField();
		Usertext.setBounds(205, 110, 148, 36);
		AdLog.getContentPane().add(Usertext);
		Usertext.setColumns(10);
		
		JLabel lblAdminPass = new JLabel("Password");
		lblAdminPass.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAdminPass.setBounds(120, 174, 76, 19);
		AdLog.getContentPane().add(lblAdminPass);
		
		Passtext = new JTextField();
		Passtext.setColumns(10);
		Passtext.setBounds(205, 171, 148, 36);
		AdLog.getContentPane().add(Passtext);
		
		//Login Button
		JButton btnAdminLog = new JButton("Login");
		
		btnAdminLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = Usertext.getText();
				String password = Passtext.getText();
				
				if (username.contains("Admin_01")&& password.contains("AdminOne")) {
					
					Usertext.setText(null);
					Passtext.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					
				} else if (username.contains("Admin_02")&& password.contains("AdminTwo")) {
					
					Usertext.setText(null);
					Passtext.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					
				} else if (username.contains("Admin_03")&& password.contains("AdminThree")) {
					
					Usertext.setText(null);
					Passtext.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					
				} 
				else 
				{
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAdminLog.setBounds(292, 247, 117, 29);
		AdLog.getContentPane().add(btnAdminLog);
		
		//Exit button going back to the Login Frame
		JButton btnBack = new JButton("Exit");
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn bck = new LogIn();
				bck.frame1.setVisible(true);
				AdLog.dispose();
				
			}
		});
		btnBack.setBounds(142, 247, 117, 29);
		AdLog.getContentPane().add(btnBack);
	}
}
