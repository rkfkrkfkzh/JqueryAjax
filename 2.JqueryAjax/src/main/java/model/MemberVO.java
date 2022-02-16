package model;

public class MemberVO {
	private String id;
	private String password;
	private String address;
	private String name;

public MemberVO(String id, String password, String address, String name) {
		super();
		this.id = id;
		this.password = password;
		this.address = address;
		this.name = name;
	}

	public MemberVO(String id) {
		super();
		this.id = id;
	}

	public MemberVO(String address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", address=" + address + ", name=" + name + "]";
	}

}
