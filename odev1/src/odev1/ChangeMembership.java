package odev1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class ChangeMembership extends JFrame{
	
	private JComboBox cb;
	private JLabel label;
	private JButton but;
	IMembership member;
	int i;
	
	public ChangeMembership(IMembership member,int i) {
		this.member = member;
		this.i = i;
		String membership[]= {"ultra premium","premium","standart"};
		Container c1 = getContentPane();
		SpringLayout layout = new SpringLayout();
		c1.setLayout(layout);
		
		label = new JLabel("hangi pakete geçmek istersiniz?");
		but = new JButton("onayla");
		
		cb = new JComboBox(membership);
		cb.setBounds(50,50,90,20);
		
		c1.add(cb);
		c1.add(label);
		c1.add(but);
		
		layout.putConstraint(SpringLayout.WEST,label,25,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,label,10,SpringLayout.NORTH,c1);
		
		layout.putConstraint(SpringLayout.WEST,cb,65,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,cb,30,SpringLayout.NORTH,c1);
		
		layout.putConstraint(SpringLayout.WEST,but,75,SpringLayout.WEST,c1);
		layout.putConstraint(SpringLayout.NORTH,but,60,SpringLayout.NORTH,c1);
		
		cb.removeItem(member.getMember());
		setTitle("paket deðiþimi");
		setSize(280, 150);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyEventHandler meh1 = new MyEventHandler();
		but.addActionListener(meh1);
		//i = membership.length;
	}
	
	public class MyEventHandler extends FakeDatabase implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if(cb.getSelectedItem() == "ultra premium") {
				log.add(member.getUserName() + " "+ member.getMember()+" paketini ultra premium paketine çevirdi");
				HighMember hm = new HighMember(member.getName(),member.getUserName(),member.getPw(),"ultra premium",member.getCard());
				boolean control = member.getMark();
				hm.setMark(control);
				
				members.add(hm);
				members.remove(i);
				JOptionPane.showMessageDialog(null,"paket deðiþtirildi sonraki ödeme zamanýnda ödenecek tutar : 50tl");
				dispose();
				i = members.size()-1;
				AnaSayfa af = new AnaSayfa(hm,i);
				af.setVisible(true);
			}
			else if(cb.getSelectedItem() == "premium") {
				log.add(member.getUserName() + " "+ member.getMember()+ " paketini premium paketine çevirdi");
				MediumMember mm = new MediumMember(member.getName(),member.getUserName(),member.getPw(),"premium",member.getCard());
				
				//teker teker parametre ver
				boolean control = member.getMark();
				mm.setMark(control);
				members.add(mm);
				members.remove(i);
				JOptionPane.showMessageDialog(null,"paket deðiþtirildi sonraki ödeme zamanýnda ödenecek tutar : 25tl");
				dispose();
				i = members.size()-1;
				AnaSayfa af = new AnaSayfa(mm,i);
				af.setVisible(true);
			}
			else if(cb.getSelectedItem() == "standart") {
				log.add(member.getUserName() + " "+ member.getMember()+ " paketini standart paketine çevirdi");
				LowMember lm = new LowMember(member.getName(),member.getUserName(),member.getPw(),"standart",member.getCard());
				boolean control = member.getMark();
				lm.setMark(control);
				members.add(lm);
				members.remove(i);
				i = members.size()-1;
				JOptionPane.showMessageDialog(null,"paket deðiþtirildi sonraki ödeme zamanýnda ödenecek tutar : 15tl");
				dispose();
				AnaSayfa af = new AnaSayfa(lm,i);
				af.setVisible(true);
			}
			
			
		}
	}
		
}
