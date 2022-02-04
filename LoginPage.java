package day1;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginPage extends Frame implements ActionListener {
	Label label1,label2,label3,label4;
	TextField textField1 = new TextField(20);
	TextField textField2 = new TextField(20);
	TextField textField3 = new TextField(20);
	Checkbox checkbox,checkbox2;
	Button button;
	LoginPage(){
		//Frame
		setTitle("Login Page");
		setSize(450,450);
		setLayout(null);
		setVisible(true);
		//Label1
		label1 = new Label();
		label1.setBounds(50, 90, 100, 50);
		//label1.setSize(400,100);
		add(label1);
		label1.setText("Name:");
		//Name
		//textField1.setAlignment();
		textField1.setBounds(150, 90, 160, 40);
		add(textField1);
		//Label2
		label2 = new Label();
		label2.setBounds(50, 145, 100, 50);
		//label1.setSize(400,100);
		add(label2);
		label2.setText("Mail id:");
		//Mail id
		//textField1.setAlignment();
		textField2.setBounds(150, 150, 160, 40);
		add(textField2);
		//number
		label3 =new Label();
		label3.setText("Number");
		label3.setBounds(50, 200, 100, 50);
		add(label3);
		textField3.setBounds(150, 200, 160, 40);
		add(textField3);
		
		Button b=new Button("SUBMIT");
		add(b);
		b.setBounds(170, 350, 100, 30);
		b.addActionListener(this);
		//checkbox1.addItemListener(this);
		//checkbox2.addItemListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name:    - "+textField1.getText());
		System.out.println("Mail id:  - "+textField2.getText());
		System.out.println("Phone number:  - "+textField3.getText());
		
		
	}
	
	public static void main(String [] args) {
		new LoginPage();
	}
}
