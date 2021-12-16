package odev1;

import java.util.ArrayList;

public class FakeDatabase  {
	
	public static ArrayList<IMembership> members = new ArrayList<>();
	public static ArrayList<IMovie> movies = new ArrayList<>();
	public static ArrayList<String> log = new ArrayList<>();
	
	public ArrayList<IMembership> getMembers() {
		return members;
	}	
	public ArrayList<IMovie> getMovies() {
		return movies;
	}
	public ArrayList<String> getLog() {
		return log;
	}
	
}
