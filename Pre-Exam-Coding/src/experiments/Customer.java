package experiments;

public class Customer {
	enum salutation {mr,mrs,ms,master,sir,major,lord};
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	private int numberOfRentals;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getNumberOfRentals() {
		return numberOfRentals;
	}
	public void setNumberOfRentals(int numberOfRentals) {
		this.numberOfRentals = numberOfRentals;
	}
	public void addAddress(Address address){
		
	}


}
