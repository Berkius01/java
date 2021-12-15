package odev1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.*;


public class AnaSayfa extends JFrame implements MouseListener{
	
	private JLabel l1,l2,l3,l4,l5,l6;
	private JLabel pl1,pl2,pl3,pl4;
	private JLabel il1,il2;
	private JTextField tf2 ;
	private JButton b1,b2,b3;
	IMembership member;
	
	FakeDatabase db = new FakeDatabase();	
	int i;
	
	public AnaSayfa(IMembership Amember,int i) {
		member=Amember;
		this.i = i;
		b2=new JButton("profil");
		b1=new JButton("çýkýþ yap");
		b3=new JButton("log kayýtlarý");
		tf2 = new JTextField(20);
		Container c = getContentPane();
		SpringLayout layout = new SpringLayout();
		c.setLayout(layout);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		b3.setVisible(false);
		//c.add(foto);
		ArrayList<IMovie> movies = new ArrayList<>();
		movies=db.getMovies();
		// filmler için deðiþkenler
		
		l1 = new JLabel(movies.get(0).getName()+"("+ member.getQua()+")");// film1 için
		pl1 = new JLabel();
		pl1.setIcon(new ImageIcon(movies.get(0).getPath()));
		pl1.setPreferredSize(new Dimension(100,100));
		pl1.addMouseListener((MouseListener) this);
		il1 = new JLabel();
		
		l2 = new JLabel(movies.get(1).getName()+"("+ member.getQua()+")");// film1 için
		pl2 = new JLabel();
		pl2.setIcon(new ImageIcon(movies.get(1).getPath()));
		pl2.setPreferredSize(new Dimension(100,100));
		pl2.addMouseListener((MouseListener) this);
		il2 = new JLabel();
		
	
		c.add(l1);
		c.add(pl1);
		c.add(il1);
		
		c.add(l2);
		c.add(pl2);
		c.add(il2);
		
		
		
		layout.putConstraint(SpringLayout.WEST,l1,30,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l1,200,SpringLayout.NORTH,c);//film 1 adý
		
		layout.putConstraint(SpringLayout.WEST,pl1,17,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,pl1,100,SpringLayout.NORTH,c);// film1 poster
		
		layout.putConstraint(SpringLayout.WEST,il1,130,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,il1,100,SpringLayout.NORTH,c);// film1 bilgilendirme
		
		

		layout.putConstraint(SpringLayout.WEST,l2,380,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l2,200,SpringLayout.NORTH,c);//film 1 adý
		
		layout.putConstraint(SpringLayout.WEST,pl2,367,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,pl2,100,SpringLayout.NORTH,c);// film1 poster
		
		layout.putConstraint(SpringLayout.WEST,il2,480,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,il2,100,SpringLayout.NORTH,c);// film1 bilgilendirme
		
		if(member.getMark()) {
			//pl2.setIcon(new ImageIcon());
			l2.setText("ebeveyn kontrolü sebebi ile film oynatýlamaz");
		}
		
		/*
		layout.putConstraint(SpringLayout.WEST,l2,200,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l2,200,SpringLayout.NORTH,c);

		layout.putConstraint(SpringLayout.WEST,l3,330,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l3,200,SpringLayout.NORTH,c);
		
		layout.putConstraint(SpringLayout.WEST,l4,450,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l4,200,SpringLayout.NORTH,c);
		
		layout.putConstraint(SpringLayout.WEST,l5,420,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l5,150,SpringLayout.NORTH,c);
		
		layout.putConstraint(SpringLayout.WEST,l6,520,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,l6,150,SpringLayout.NORTH,c);*/
		
		
		
		layout.putConstraint(SpringLayout.EAST,b1,-6,SpringLayout.EAST,c);
		layout.putConstraint(SpringLayout.NORTH,b1,6,SpringLayout.NORTH,c);//çýkýþ
		
		layout.putConstraint(SpringLayout.WEST,b2,6,SpringLayout.WEST,c);
		layout.putConstraint(SpringLayout.NORTH,b2,6,SpringLayout.NORTH,c);//profil
		
		layout.putConstraint(SpringLayout.EAST,b3,-106,SpringLayout.EAST,c);
		layout.putConstraint(SpringLayout.NORTH,b3,6,SpringLayout.NORTH,c);//log
		
		setTitle("netflix");
		setSize(1500, 750);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		if(member.getMember()=="admin") {
			b3.setVisible(true);
		}
		
		
		MyEventHandler meh1 = new MyEventHandler();
		b1.addActionListener(meh1);
		b2.addActionListener(meh1);
		b3.addActionListener(meh1);
		
	}
	public class MyEventHandler implements ActionListener {
		
		
		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getSource()==b1) {
				go();
			}
			else if(ae.getSource()==b2) {
				dispose();
				Profil p = new Profil(member,i);
				p.setVisible(true);
			}
			else if(ae.getSource()==b3) {
				System.out.println("evet");
				Log l = new Log();
				l.setVisible(true);
			}
			
		}
		public void go() {
			dispose();
			LoginPage lp = new LoginPage();
			lp.setVisible(true);
		}
	}

	public void mouseClicked(java.awt.event.MouseEvent e) {
		
	}

	public void mousePressed(java.awt.event.MouseEvent e) {	}
	
	public void mouseReleased(java.awt.event.MouseEvent e) {}
	
	public void mouseEntered(java.awt.event.MouseEvent e) {
		ArrayList<IMovie> movies = new ArrayList<>();
		movies=db.getMovies();
		if(e.getSource()==pl1) {
			il1.setText("<html>"+movies.get(0).getInfo()+"<br>"+movies.get(0).getScore()+"<html>");
		}
		else if(e.getSource()==pl2) {
			il2.setText("<html>"+movies.get(1).getInfo()+"<br>"+movies.get(1).getScore()+"<html>");
		}
		
		
	}
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		il1.setText("");
		il2.setText("");
	}
}
