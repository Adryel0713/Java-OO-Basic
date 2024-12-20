package exercise03;

public class Student {
	private String name;
	
	private Double t1;
	private Double t2;
	private Double t3;
	
	public Student() {
		
	}

	public Student(String name, Double t1, Double t2, Double t3) {
		this.name = name;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getT1() {
		return t1;
	}

	public void setT1(Double t1) {
		this.t1 = t1;
	}

	public Double getT2() {
		return t2;
	}

	public void setT2(Double t2) {
		this.t2 = t2;
	}

	public Double getT3() {
		return t3;
	}

	public void setT3(Double t3) {
		this.t3 = t3;
	}
	
	public void getFinalGrade() {
		if(t1 + t2 + t3 >= 60.0) {
			System.out.printf("FINAL GRADE = %.2f\n%s" , (t1 + t2 + t3) , "PASS");
		}else {
			System.out.printf("FAILED! %nMISSING %.2f POINTS",(-(t1 + t2 + t3 - 60)));
		}
	}
}
