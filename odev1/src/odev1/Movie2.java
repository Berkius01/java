package odev1;

import javax.swing.*;

public class Movie2  implements IMovie {
	
	private JLabel foto = new JLabel();
	private String name="matrix";
	private String score="10/10";
	private String info="hackerlar";
	private String path="C:\\matrix.jpg ";
	private String control = "18";
	
	
	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}


	public void setScore(String score) {
		
		this.score = score;
	}

	public String getScore() {	
		return score;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String getInfo() {
		return info;
	}

	@Override
	public String getPath() {
		return path;
	}

}
