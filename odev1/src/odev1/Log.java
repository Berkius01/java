package odev1;

import java.awt.Container;
import java.util.ArrayList;

import javax.swing.*;

public class Log  extends JFrame{
	//private JLabel label;
	private JTextArea txt;
	public static ArrayList<String> log = new ArrayList<>();
	FakeDatabase db = new FakeDatabase();
	public Log() {
		System.out.println("evet2");
		//label = new JLabel();
		txt = new JTextArea();
		Container c1 = getContentPane();
		SpringLayout layout = new SpringLayout();
		c1.setLayout(layout);
		log = db.getLog();
		//txt.set
		c1.add(txt);
		layout.putConstraint(SpringLayout.WEST,txt,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,txt,6,SpringLayout.NORTH,c1);
		
		for (int i=0;i<log.size();i++) {
			txt.setText(txt.getText()+"\r\n"+log.get(i));
		}
		
		
		//txt.setText("sucuk");
		
		setTitle("log");
		setSize(650, 500);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
}
