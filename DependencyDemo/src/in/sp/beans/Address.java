package in.sp.beans;

public class Address {
	private int houseNo;
	private String city;
	private int pincode;
	
	//using constructor injection
	public Address(int houseNo, String city, int pincode) {
		this.houseNo = houseNo;
		this.city = city;
		this.pincode = pincode;
		System.out.println("Address constructor");
	}
	//using setter injection
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}
