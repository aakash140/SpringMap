package com.spring.map;

import java.util.Map;
import java.util.Set;

public class Employee {

	private int emp_id;
	private String name;
	private Map<Computers,Printers> devices;
	public Employee(Map<Computers, Printers> devices) {
		super();
		this.devices = devices;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void displayInfo(){
		Computers computer=null;
		Printers printer=null;
		Set<Map.Entry<Computers, Printers>> set=devices.entrySet();
		for(Map.Entry<Computers, Printers> map:set){
			computer=(Computers)map.getKey();
			printer=(Printers)map.getValue();
		}
		System.out.println(name+" with employee id "+emp_id+" is assigned following devices:");
		System.out.println("System: "+computer.getDesktopID()+" "+computer.getOperatingSystem());
		System.out.println("Printer: "+printer.getPrinterID()+" "+printer.getType());
	}
}