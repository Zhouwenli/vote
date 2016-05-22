package com.yc.us.entity;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 2537509124762257764L;
	private static int USER_TYPE_ORDINARY=1;      //普通用户
	private static int USER_TYPE_ADMIN=2;           //管理员
	
	private int VU_USER_ID;
	private String VU_USER_NAME;
	private String VU_PASSWORD;
	private int VU_VERSION=1;
	private int VU_STATUS;
	private String VU_EMAIL;
	
	
	
	public User() {
		
	}
	
	public User(String vU_EMAIL) {
	
		VU_EMAIL = vU_EMAIL;
	}

	public User(String vU_USER_NAME, String vU_PASSWORD, String vU_EMAIL) {
		super();
		VU_USER_NAME = vU_USER_NAME;
		VU_PASSWORD = vU_PASSWORD;
		VU_EMAIL = vU_EMAIL;
	}

	public String getVU_EMAIL() {
		return VU_EMAIL;
	}

	public void setVU_EMAIL(String vU_EMAIL) {
		VU_EMAIL = vU_EMAIL;
	}

	public static int getUSER_TYPE_ORDINARY() {
		return USER_TYPE_ORDINARY;
	}
	public static void setUSER_TYPE_ORDINARY(int uSER_TYPE_ORDINARY) {
		USER_TYPE_ORDINARY = uSER_TYPE_ORDINARY;
	}
	public static int getUSER_TYPE_ADMIN() {
		return USER_TYPE_ADMIN;
	}
	public static void setUSER_TYPE_ADMIN(int uSER_TYPE_ADMIN) {
		USER_TYPE_ADMIN = uSER_TYPE_ADMIN;
	}
	public int getVU_USER_ID() {
		return VU_USER_ID;
	}
	public void setVU_USER_ID(int vU_USER_ID) {
		VU_USER_ID = vU_USER_ID;
	}
	public String getVU_USER_NAME() {
		return VU_USER_NAME;
	}
	public void setVU_USER_NAME(String vU_USER_NAME) {
		VU_USER_NAME = vU_USER_NAME;
	}
	public String getVU_PASSWORD() {
		return VU_PASSWORD;
	}
	public void setVU_PASSWORD(String vU_PASSWORD) {
		VU_PASSWORD = vU_PASSWORD;
	}
	public int getVU_VERSION() {
		return VU_VERSION;
	}
	public void setVU_VERSION(int vU_VERSION) {
		VU_VERSION = vU_VERSION;
	}
	public int getVU_STATUS() {
		return VU_STATUS;
	}
	public void setVU_STATUS(int vU_STATUS) {
		VU_STATUS = vU_STATUS;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [VU_USER_ID=" + VU_USER_ID + ", VU_USER_NAME="
				+ VU_USER_NAME + ", VU_PASSWORD=" + VU_PASSWORD
				+ ", VU_VERSION=" + VU_VERSION + ", VU_STATUS=" + VU_STATUS
				+ ", VU_EMAIL=" + VU_EMAIL + "]";
	}

	
	
}
