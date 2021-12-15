package odev1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.*;

import odev1.LoginPage.MyEventHandler;


public class SignIn extends JFrame{
	
	private JTextField tf1;
	private JTextField tf2,tf3,tf4;
	private JButton b1,b2;
	private JLabel label1,label2,label3,label4,label5,label6;
	private JComboBox cb;
	private JCheckBox chb;
	
	public SignIn() {
		String membership[]= {"ultra premium","premium","standart","free"};
		Container c1 = getContentPane();
		SpringLayout layout = new SpringLayout();
		c1.setLayout(layout);
		
		cb = new JComboBox(membership);
		cb.setBounds(50,50,90,20);
		
		chb = new JCheckBox("ebeveyn kontrolü");
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3=new JTextField(20);
		tf4 = new JTextField(20);
		
		b1=new JButton("ödemeyi yap ve kayýt olduþtur");
		b2=new JButton("login page");
		
		label1=new JLabel("isim");
		label2=new JLabel("þifre");
		label3 = new JLabel("kart bilgileri");
		label4 = new JLabel("hesap türü");
		label5 = new JLabel("kullanýcý adý");
		label6 = new JLabel("<html>premium hesap: 50 tl<br/>premium hesap: 25tl<br/>standart hesap: 15tl<br/> deneme hesabý: 30 gün bedava<html>");
		
		c1.add(label1);
		c1.add(tf1);//isim
		c1.add(label2);
		c1.add(tf2);
		c1.add(label3);
		c1.add(tf3);//kart
		c1.add(b1);
		c1.add(b2);//login page git
		c1.add(label4);//hesap
		c1.add(cb);
		c1.add(label5);
		c1.add(tf4);
		c1.add(label6);
		c1.add(chb);
		
		layout.putConstraint(SpringLayout.WEST,label1,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label1,6,SpringLayout.NORTH,c1);// isim yazan label
		
		layout.putConstraint(SpringLayout.WEST,label6,286,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label6,6,SpringLayout.NORTH,c1);// isim yazan label
		
		layout.putConstraint(SpringLayout.WEST,tf1,75,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,tf1,6,SpringLayout.NORTH,c1);// isim için text field
		
		layout.putConstraint(SpringLayout.WEST,label5,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label5,30,SpringLayout.NORTH,c1);// kullanýcý adý için label
		
		layout.putConstraint(SpringLayout.WEST,tf4,75,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,tf4,30,SpringLayout.NORTH,c1);// kullanýcý adý için textfield
		
		layout.putConstraint(SpringLayout.WEST,label2,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label2,50,SpringLayout.NORTH,c1);// þifre yazan label
		
		layout.putConstraint(SpringLayout.WEST,tf2,75,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,tf2,50,SpringLayout.NORTH,c1);// þfre için textfield
		
		layout.putConstraint(SpringLayout.WEST,label3,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label3,70,SpringLayout.NORTH,c1); // kart b,lgileri yazan label
		
		layout.putConstraint(SpringLayout.WEST,tf3,75,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,tf3,70,SpringLayout.NORTH,c1); // kart bilgileri için texet field
		
		layout.putConstraint(SpringLayout.WEST,label4,6,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label4,100,SpringLayout.NORTH,c1);// hesap türü label
		
		layout.putConstraint(SpringLayout.WEST,cb,75,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,cb,100,SpringLayout.NORTH,c1);// combobox
		
		layout.putConstraint(SpringLayout.WEST,chb,210,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,chb,100,SpringLayout.NORTH,c1);//velet
		
		layout.putConstraint(SpringLayout.WEST,b1,60,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,b1,130,SpringLayout.NORTH,c1);//create account
		
		layout.putConstraint(SpringLayout.WEST,b2,100,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,b2,160,SpringLayout.NORTH,c1);// login page
		
		
		
		setTitle("sign up");
		setSize(500, 250);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
		MyEventHandler meh1 = new MyEventHandler();
		b1.addActionListener(meh1);
		b2.addActionListener(meh1);
		
	}
	
	public class MyEventHandler extends FakeDatabase implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			
			if (ae.getSource()==b1) {
				String membership = cb.getSelectedItem().toString();
				if(membership == "ultra premium") {
					HighMember hm = new HighMember(tf1.getText(),tf4.getText(),tf2.getText(),membership,tf3.getText());
					hm.setMark(chb.isSelected());
					members.add(hm);
					System.out.println(members);
					log.add(tf1.getText()+" kiþisi "+tf4.getText()+" kullanýcý adý ile "+tf2.getText()+" þifresi ile "+membership+" türünde "+tf3.getText()+" hesabý oluþuturdu");

					//members.add(new HighMember(tf1.getText(),tf3.getText(),membership));
					hm.ToString();
					JOptionPane.showMessageDialog(null,"ultra premium hesap oluþturuldu");
					//go();
				}
				else if(membership == "premium") {
					MediumMember mm = new MediumMember(tf1.getText(),tf4.getText(),tf2.getText(),membership,tf3.getText());
					mm.setMark(chb.isSelected());
					members.add(mm);
					System.out.println(members.get(0).getName());
					log.add(tf1.getText()+" kiþisi "+tf4.getText()+" kullanýcý adý ile "+tf2.getText()+" þifresi ile "+membership+" türünde "+tf3.getText()+" hesabý oluþuturdu");

					mm.ToString();
					JOptionPane.showMessageDialog(null,"premium hesap oluþturuldu");
				}
				else if(membership == "standart") {
					log.add(tf1.getText()+" "+tf4.getText()+" "+tf2.getText()+" "+membership+" "+tf3.getText()+" hesabý oluþuturuldu");
					LowMember lm = new LowMember(tf1.getText(),tf4.getText(),tf2.getText(),membership,tf3.getText());
					lm.setMark(chb.isSelected());
					members.add(lm);
					System.out.println(members);
					log.add(tf1.getText()+" kiþisi "+tf4.getText()+" kullanýcý adý ile "+tf2.getText()+" þifresi ile "+membership+" türünde "+tf3.getText()+" hesabý oluþuturdu");
					lm.ToString();
					JOptionPane.showMessageDialog(null,"standart hesap oluþturuldu");
				}
				else if(membership == "free") {
					FreeMember fm = new FreeMember(tf1.getText(),tf4.getText(),tf2.getText(),membership,tf3.getText());
					fm.setMark(chb.isSelected());
					members.add(fm);
					System.out.println(members);
					log.add(tf1.getText()+" kiþisi "+tf4.getText()+" kullanýcý adý ile "+tf2.getText()+" þifresi ile "+membership+" türünde "+tf3.getText()+" hesabý oluþuturdu");
					//list.add(fm);
					fm.ToString();
					JOptionPane.showMessageDialog(null,"ücretsiz deneme hesabý oluþturuldu");
				}
				
			}
			if(ae.getSource()==b2) {
				go();
			}
			
		}
		public void go() {
			dispose();
			LoginPage lp = new LoginPage();
			lp.setVisible(true);
		}
	}
}
