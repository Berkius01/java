package odev1;

public class Main extends FakeDatabase {

	public static void main(String[] args) {
		//MediumMember mm = new MediumMember("ege"," hd ","123456");
		//LowMember lm = new LowMember("arda","sd","654321");
		//HighMember hm = new HighMember("çaðrý","uhd","313131");
		
		
		/*mm.ToString();
		lm.ToString();
		hm.ToString();*/
		
		Movie1 mov1 = new Movie1();
		movies.add(mov1);
		
		Movie2 mov2 = new Movie2();
		movies.add(mov2);
		/*
		Movie3 mov3 = new Movie3();
		movies.add(mov3);
		
		Movie4 mov4 = new Movie4();
		movies.add(mov4);
		
		Movie5 mov5 = new Movie5();
		movies.add(mov5);
		
		Movie6 mov6 = new Movie6();
		movies.add(mov6);*/
		
		LoginPage lp = new LoginPage();
		HighMember root = new HighMember("berk","berkius","12345","admin","1212121212");
		members.add(root);
	}

}
