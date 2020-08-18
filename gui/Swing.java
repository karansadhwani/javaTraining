package com.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing extends JPanel implements ActionListener{

	JLabel lblLoginName, lblPassword;
	JTextField txtLoginName, txtPassword;
	JButton btnOk, btnCancel;

	JPanel panelMain, panelLogin, panelButton;

	Swing() {
		
		super();
		lblLoginName = new JLabel("Login Name : ");
		lblPassword = new JLabel("Password : ");

		txtLoginName = new JTextField(10);
		txtPassword = new JTextField(10);

		btnOk = new JButton("OK");
		btnCancel = new JButton("Cancel");

		panelMain = new JPanel();
		panelLogin = new JPanel();
		panelButton = new JPanel();

		panelLogin.add(lblLoginName);
		panelLogin.add(txtLoginName);
		panelLogin.add(lblPassword);
		panelLogin.add(txtPassword);

		panelButton.add(btnOk);
		panelButton.add(btnCancel);

		panelMain.setLayout(new BorderLayout());
		panelMain.add(panelLogin, BorderLayout.CENTER);
		panelMain.add(panelButton, BorderLayout.SOUTH);
		add(panelMain);
		
		btnCancel.addActionListener(this);
		btnOk.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent evt){
		
		Object source = evt.getSource();
/*		if(source == btnOk){
			System.out.println("OK Button is clicked");
		}
		else
			System.out.println("Cancel Button is Clicked");
		*/
		if(source == btnOk){
			String loginName = txtLoginName.getText();
			String password = txtPassword.getText();
			
			if(loginName.equals(password)){
				System.out.println("Successfully Registered !!");
			}
			else{
				System.out.println("Login Failed !!");
			}
		}
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("AWT Login");
		frame.setVisible(true);
		frame.add(new Swing());
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
}


