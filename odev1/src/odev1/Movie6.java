package odev1;

import javax.swing.*;

public class Movie6  implements IMovie {
	
	private JLabel foto = new JLabel();
	private String name="star wars";
	private String score="9.5/10";
	private String info="uzay savaþlarý";
	
	
	
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setScore(String score) {
		
		this.score = score;
	}

	@Override
	public String getScore() {
		
		return score;
	}

	@Override
	public void setInfo(String info) {
		this.info = info;
		
	}

	@Override
	public String getInfo() {
		
		return info;
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

}
