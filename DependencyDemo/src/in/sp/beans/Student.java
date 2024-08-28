package in.sp.beans;

public class Student {
	private int id;
	private String name;
	private Address address;
	
	public void setId(int id) {
		System.out.println("setId");
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	public void setAddress(Address address) {
		System.out.println("setAddress");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
