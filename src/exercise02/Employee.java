package exercise02;

public class Employee {
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Employee() {
		
	}

	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		 grossSalary = grossSalary + grossSalary * percentage/100; 
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
}
