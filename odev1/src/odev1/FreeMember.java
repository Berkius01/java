package odev1;

public class FreeMember implements IMembership{
	
	private String name;
	private String username;
	private String member;
	private String card;
	private String pw;
	private boolean mark;
	private String qua = "4k";
	
	FreeMember(String name,String username,String pw, String member, String card){
		this.name = name;
		this.username = username;
		this.pw = pw;
		this.member=member;
		this.card=card;
		System.out.println("free paket hesab� a��ld�");
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public String getQua() {
		return qua;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setMember(String member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMember() {
		// TODO Auto-generated method stub
		return card;
	}

	@Override
	public void setCard(String card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCard() {
		// TODO Auto-generated method stub
		return card;
	}
	@Override
	public void ToString() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPw(String pw) {
		// TODO Auto-generated method stub
		this.pw = pw;
	}
	@Override
	public String getPw() {
		// TODO Auto-generated method stub
		return pw;
	}
	@Override
	public void setUserName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return username;
	}
	@Override
	public void setMark(boolean mark) {
		this.mark = mark;
		
	}


	@Override
	public boolean getMark() {
		// TODO Auto-generated method stub
		return mark;
	}

}
