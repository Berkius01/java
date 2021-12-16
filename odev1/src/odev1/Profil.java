package odev1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




public class Profil extends JFrame{
	
	private JLabel l1,l2,l3,l4;
	IMembership member;
	private JButton b1,b2;
	int i;
	public Profil(IMembership Pmember,int i){
		member = Pmember;
		this.i = i;
		Container c1 = getContentPane();
		SpringLayout layout = new SpringLayout();
		c1.setLayout(layout);
		
		l1 = new JLabel();
		c1.add(l1);
		l1.setText("adý: " + member.getName());
		layout.putConstraint(SpringLayout.WEST,l1,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,l1,6,SpringLayout.NORTH,c1);
		
		l2 = new JLabel();
		c1.add(l2);
		l2.setText("kullanýcý adý: " + member.getUserName());
		layout.putConstraint(SpringLayout.WEST,l2,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,l2,34,SpringLayout.NORTH,c1);
		
		l3 = new JLabel();
		c1.add(l3);
		l3.setText("üyelik türü: " + member.getMember());
		layout.putConstraint(SpringLayout.WEST,l3,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,l3,52,SpringLayout.NORTH,c1);
		
		l4 = new JLabel();
		c1.add(l4);
		l4.setText("<html>kart bilgileri: " + member.getCard()+"<br>"+"ebevyn kontrolü: "+member.getMark()+"<html>");
		layout.putConstraint(SpringLayout.WEST,l4,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,l4,70,SpringLayout.NORTH,c1);
		
		
		
		b1=new JButton("anasayfa");
		b2 = new JButton("paket deðiþtir");
		
		c1.add(b1);
		c1.add(b2);
		layout.putConstraint(SpringLayout.WEST,b1,10,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,b1,120,SpringLayout.NORTH,c1);
		
		layout.putConstraint(SpringLayout.WEST,b2,100,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,b2,120,SpringLayout.NORTH,c1);
		
		
		setTitle("profil");
		setSize(300, 250);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		MyEventHandler meh1 = new MyEventHandler();
		b1.addActionListener(meh1);
		b2.addActionListener(meh1);
	}
	public class MyEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if(ae.getSource()==b1) {
				dispose();
				AnaSayfa as = new AnaSayfa(member,i);
				as.setVisible(true);
			}
			else if(ae.getSource()==b2) {
				dispose();
				ChangeMembership cm = new ChangeMembership(member,i);
				cm.setVisible(true);
			}
			
			
		}
	}
}
