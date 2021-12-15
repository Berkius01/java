package odev1;

import javax.swing.*;

public class Movie1  implements IMovie {
	
	//private JLabel foto = new JLabel();
	private String name="harry potter";
	private String score="8.7/10";
	private String info="büyücü falan";
	private String path = "C:\\heri.jpg";
	private String control = "16";
	//foto.setIcon(new ImageIcon("C:\\indir.png"));
	
	public void setName(String name) {
		this.name=name;
	}
	public String getPath(){
		return path;
	}	
	
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

}
