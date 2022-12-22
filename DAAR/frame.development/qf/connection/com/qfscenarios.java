package qf.connection.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Desktop;

import javax.swing.JFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import org.testng.collections.Lists;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DesktopManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.awt.event.ActionEvent;

public class qfscenarios extends JFrame {

	static JComboBox drpdwn_env;
	TestListenerAdapter tla = new TestListenerAdapter();
	TestNG tng = new TestNG();
	List<String> suites = Lists.newArrayList();

	private JPanel contentPane;
	private JTextField sign;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					qfscenarios frame = new qfscenarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public qfscenarios() {
		setBackground(new Color(255, 204, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 342);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("QUARA FINANCE AUTOMATION TESTING TOOL");
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(152, 11, 352, 37);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Test Suite :");
		lblNewLabel_1.setBounds(25, 87, 94, 14);
		contentPane.add(lblNewLabel_1);

		final JComboBox drpdwn_suite = new JComboBox();
		drpdwn_suite.setModel(new DefaultComboBoxModel(
				new String[] { "--Select--", "Smoke Suite", "Sanity Suite", "Regression Suite", "Module Wise" }));
		drpdwn_suite.setBounds(89, 83, 137, 22);
		contentPane.add(drpdwn_suite);

		JLabel lblNewLabel_1_1 = new JLabel("Enviorment");
		lblNewLabel_1_1.setBounds(314, 87, 61, 14);
		contentPane.add(lblNewLabel_1_1);

		final JComboBox dp = new JComboBox();
		dp.setModel(new DefaultComboBoxModel(
				new String[] { "---Select---", "ALL", "Lead", "Customer", "SR", "Campaign", "Report" }));
		dp.setBounds(89, 137, 137, 22);
		contentPane.add(dp);

		drpdwn_env = new JComboBox();
		drpdwn_env.setModel(
				new DefaultComboBoxModel(new String[] { "---Select---", "ACCs", "SA", "LOAD", "SIT", "UAT" }));
		drpdwn_env.setBounds(397, 83, 170, 22);
		contentPane.add(drpdwn_env);

		JButton btn_run = new JButton("RUN");
		btn_run.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				actionURL();

				if (drpdwn_suite.getSelectedIndex() == 1
						|| drpdwn_suite.getSelectedIndex() == 2 && dp.getSelectedItem().equals("ALL")) {

					System.out.println("YES");

					suites.add(
							"C:\\Users\\Vijay Sharma\\Workspaces\\MyEclipse\\Quara_Finance\\frame.testing\\TestSuite\\SANITYPACK.xml");
					tng.setTestSuites(suites);
					tng.run();

				} else {

					System.out.println("NO");
				}

			}
		});
		btn_run.setBounds(280, 251, 89, 23);
		contentPane.add(btn_run);

		JLabel lblNewLabel_1_2 = new JLabel("Process :");
		lblNewLabel_1_2.setBounds(25, 141, 94, 14);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Signed By :");
		lblNewLabel_1_2_1.setBounds(314, 141, 94, 14);
		contentPane.add(lblNewLabel_1_2_1);

		sign = new JTextField();
		sign.setBounds(397, 138, 170, 20);
		contentPane.add(sign);
		sign.setColumns(10);
		
		JButton btnNewButton = new JButton("View Logs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
//			
		}});
		btnNewButton.setBounds(379, 251, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Open Report");
		btnNewButton_1.setBounds(478, 251, 89, 23);
		contentPane.add(btnNewButton_1);

	}

	public String actionURL() {

		String urldetails[] = { "https://dsgdev.crmnext.com/quara/app/login/login",
				"https://dsgdev.crmnext.com/SAG/app/login/login" };

		Object selenv = drpdwn_env.getSelectedItem();
		
		if(selenv.equals("ACCs")) {
			
			return urldetails[0];
		}		
		if(selenv.equals("SA")) {
			
			return urldetails[1];
		}
		
		return null;

	}
}