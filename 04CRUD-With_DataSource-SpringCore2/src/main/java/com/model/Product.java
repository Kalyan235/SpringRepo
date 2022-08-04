package com.model;

public class Product {

	private int pid;
	private String name;

	public Product() {
		super();
	}

	public Product(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}

}
