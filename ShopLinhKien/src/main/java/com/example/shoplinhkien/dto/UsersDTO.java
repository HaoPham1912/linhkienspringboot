package com.example.shoplinhkien.dto;

public class UsersDTO extends AbstractDTO<UsersDTO> {

	private String userName;
	private String passWord;
	private String fullName;
	private Integer status;
	private String email;
	private String address;
	private String phone;
	private String role;
	//private List<OrderEntity> orderList = new ArrayList<OrderEntity>();
	//private List<CommentEntity> commList = new ArrayList<CommentEntity>();



	public String getUserName() {
		return userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}