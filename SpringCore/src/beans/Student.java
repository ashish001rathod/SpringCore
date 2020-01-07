package beans;

public class Student {
	private int regno;
	private String stdname;
	Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int regno, String stdname) {
		super();
		this.regno = regno;
		this.stdname = stdname;
	}

	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
}
