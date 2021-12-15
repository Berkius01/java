package odev1;

public interface IMembership {
	
	abstract void setName(String name);
	abstract String getName();
	
	abstract void setUserName(String username);
	abstract String getUserName();
	abstract String getQua();
	
	abstract void setPw(String pw);
	abstract String getPw();
	
	abstract void setMember(String member);
	abstract String getMember();
	
	abstract void setCard(String card);
	abstract String getCard();
	
	abstract void setMark(boolean mark);
	abstract boolean getMark();
	
	abstract void ToString();
}
