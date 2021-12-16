package odev1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class LoginPage extends JFrame {
	
	private JLabel l1,l2,l3;
	private JButton f1;
	private JButton f2;
	private JTextField tf1;
	private JTextField tf2;
	
	
	public LoginPage() {
		f1 = new JButton("Login");
		f2 = new JButton("Sign up");
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		l1=new JLabel("id");
		l2=new JLabel("þifre");
		l3=new JLabel();//arkaplan fotoðrafý için
		
		//componentleri neewleme
		
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);//label yazý renkleri deðiþtirme
		
		
		
		Container c = getContentPane();
		SpringLayout layout = new SpringLayout();
		c.setLayout(layout);
		
		l3.setMaximumSize(getMaximumSize());
		l3.setIcon(new ImageIcon("C:\\indir.png"));//label forotoðrafý ayarlama
		//c.setBackground(Color.red);
		
		c.add(f1);
		c.add(f2);
		c.add(l1);
		c.add(tf1);
		c.add(l2);
		c.add(tf2);
		c.add(l3);
		
		
		layout.putConstraint(SpringLayout.WEST, l1, 6, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, l1, 6, SpringLayout.NORTH, c);//L1
		
	
		layout.putConstraint(SpringLayout.WEST, tf1, 40, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, tf1, 6, SpringLayout.NORTH, c);//TF1
		
		
		layout.putConstraint(SpringLayout.WEST, l2, 6, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, l2, 30, SpringLayout.NORTH, c);//L2
		
		layout.putConstraint(SpringLayout.WEST, tf2, 40, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, tf2, 30, SpringLayout.NORTH, c);//L1
		
		layout.putConstraint(SpringLayout.WEST, f1, 70, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, f1, 60, SpringLayout.NORTH, c);//f1
		
		layout.putConstraint(SpringLayout.WEST, f2, 140, SpringLayout.WEST, c);
		layout.putConstraint(SpringLayout.NORTH, f2, 60, SpringLayout.NORTH, c);//f2
		
		
		
		setTitle("Login");
		setSize(300, 150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyEventHandler meh = new MyEventHandler();
		f1.addActionListener(meh);
		f2.addActionListener(meh);
	}
	

	public class MyEventHandler extends FakeDatabase implements ActionListener {

		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getSource()==f1) {
				
				String id = tf1.getText().toString();
				String pw = tf2.getText().toString();
				System.out.println(id);
				
				for(int i=0;i<members.size();i++) {
					System.out.println(i);
					try {
						if(members.get(i).getUserName().equals(id) && members.get(i).getPw().equals(pw)) {//burda cortluyor zooooort
							dispose();
							AnaSayfa af = new AnaSayfa(members.get(i),i);
							af.setVisible(true);
						}
					}
					catch(Exception e) {
						e.getMessage();
					}
				}
			}
			
			else if (ae.getSource()==f2) {
				System.out.println("sign up page");
				dispose();
				SignIn si = new SignIn();
				si.setVisible(true);
			}
			
			else { 
				 System.exit(0);
			}
		}//action performed
	}//event handler
}//class
