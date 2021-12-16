package odev1;

public class HighMember implements IMembership {
	
	private String name;
	private String username;
	private String member;
	private String card;
	private String pw;
	private boolean mark;
	private String qua = "4k";
	HighMember(String name,String username,String pw, String member, String card){
		this.name = name;
		this.username = username;
		this.member=member;
		this.pw = pw;
		this.card=card;
		System.out.println("yüksek paket hesabý açýldý");
	}
	public String getQua() {
		return qua;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	
	public void setMember(String member) {
		this.member = member;
	}

	public String getMember() {
		return member;
	}

	
	public void setCard(String card) {
		this.card = card;
	}

	public String getCard() {
		return card;
	}
	
	public void ToString() {
		System.out.println(name+" kiþisini paketi "+member+" kart numarasý:"+card);
	}


	@Override
	public void setPw(String pw) {
		// TODO Auto-generated method stub
		this.pw = pw;
	}


	@Override
	public String getPw() {
		return pw;
		
	}


	@Override
	public void setUserName(String username) {
		this.username = username;
		
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
