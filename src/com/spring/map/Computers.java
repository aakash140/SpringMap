package com.spring.map;

public class Computers {

	private int desktopID;
	private String operatingSystem;
	public Computers(int desktopID, String operatingSystem) {
		super();
		this.desktopID = desktopID;
		this.operatingSystem = operatingSystem;
	}
	public int getDesktopID() {
		return desktopID;
	}
	public void setDesktopID(int desktopID) {
		this.desktopID = desktopID;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}
