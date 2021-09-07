package entities;

public class Rent {
	
	public String name;
	public String email;
	public int room;
	
	public Rent(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public String toString() {
		return name+", "+email;
	}
	
	
}
