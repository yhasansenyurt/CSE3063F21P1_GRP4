package main;

public class Instructor extends Person {
	
	String title;
	int roomLocation;
	
	public Instructor(String name,String surname,String title,int roomLocation) {
		super(); 
		this.title = title;
		this.roomLocation = roomLocation;
	}

}