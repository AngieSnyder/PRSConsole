package prs.business;

public class Vendor {
	private int id;
	private int code;
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
	private boolean isPreApproved;
	
	
	public Vendor(int id, int code, String name, String address, String city, String state, String zip, String email,
			boolean isPreApproved) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.isPreApproved = isPreApproved;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isPreApproved() {
		return isPreApproved;
	}


	public void setPreApproved(boolean isPreApproved) {
		this.isPreApproved = isPreApproved;
	}


	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", email=" + email + ", isPreApproved=" + isPreApproved + "]";
	}
	
	
	
	
}
