package com.spring.map;

public class Printers {

	private int printerID;
	private String type;
	public Printers(int printerID, String type) {
		super();
		this.printerID = printerID;
		this.type = type;
	}
	public int getPrinterID() {
		return printerID;
	}
	public void setPrinterID(int printerID) {
		this.printerID = printerID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
