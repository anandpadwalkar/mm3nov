package com.swapnil.bookapp.vo;

import java.util.UUID;

public class Author {

	private UUID authorId;
	private String name;
	private String phone;
	private String address;
	
	/**
	 * @param authorId
	 * @param name
	 * @param phone
	 * @param address
	 * use to set value
	 */
	public Author(UUID authorId, String name, String phone, String address) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}  


	/**
	 * @return the authorId
	 */
	public UUID getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(UUID authorId) {
		this.authorId = authorId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}
