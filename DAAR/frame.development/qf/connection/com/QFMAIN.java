package qf.connection.com;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.openqa.selenium.devtools.v85.emulation.Emulation.SetEmulatedVisionDeficiencyType;

public class QFMAIN {

	private JFrame frame;
	private JTextField txt_username;
	private JPasswordField txt_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QFMAIN window = new QFMAIN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QFMAIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frame.setType(Type.POPUP);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 622, 316);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_icon = new JLabel("");
		lbl_icon.setIcon(new ImageIcon("C:\\Users\\Vijay Sharma\\OneDrive\\Desktop\\CRMNEXT.png"));
		lbl_icon.setBounds(-31, 11, 287, 221);
		frame.getContentPane().add(lbl_icon);
		
		final JLabel lbl_username = new JLabel("Username :");
		lbl_username.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_username.setBackground(new Color(128, 128, 128));
		lbl_username.setForeground(new Color(0, 0, 255));
		lbl_username.setBounds(231, 79, 97, 25);
		frame.getContentPane().add(lbl_username);
		
		JLabel lbl_password = new JLabel("Password :");
		lbl_password.setForeground(Color.BLUE);
		lbl_password.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_password.setBackground(Color.GRAY);
		lbl_password.setBounds(231, 141, 97, 25);
		frame.getContentPane().add(lbl_password);
		
		txt_username = new JTextField();
		txt_username.setBounds(330, 83, 188, 20);
		frame.getContentPane().add(txt_username);
		txt_username.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(332, 145, 186, 20);
		frame.getContentPane().add(txt_password);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt_username.getText().equalsIgnoreCase("Ishant")&& txt_password.getText().equals("Ishant@123")) {
					System.out.println("Hello");
					qfscenarios f = new qfscenarios();
					f.setVisible(true);
					
				
					
					
				}else {
					
					JOptionPane.showMessageDialog(btnNewButton, "Please Enter Valid Login Details");
					
					txt_username.setText("");
					txt_password.setText("");
					
				
				}
				
		
			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(433, 189, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
