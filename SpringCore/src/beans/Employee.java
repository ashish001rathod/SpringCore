package beans;

import java.util.List;

public class Employee {
	private int empCode;
	private String empName;
	private double salary;
	private List<String> skills;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
		public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void start(){
		System.out.println("start method");
	}
	public void stop(){
		System.out.println("stop method");
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

}
