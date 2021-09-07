package employee;

public class Information {

	public String name;
	public double grosssalary;
	public double tax;
	
	public double netSalary() {
		return grosssalary-tax;
	}
	public void increaseSalary( double percentage) {
		grosssalary+= grosssalary*percentage/100;
	}
	public String toString() {
		return (name+", $"+grosssalary);
	}
	
	
	
}
