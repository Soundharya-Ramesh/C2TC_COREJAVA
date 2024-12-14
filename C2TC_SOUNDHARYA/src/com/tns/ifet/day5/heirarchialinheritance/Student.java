package com.tns.ifet.day5.heirarchialinheritance;

public class Student {
	private String clas;
	private float per;
	public Student() {
		System.out.println("Student class default constructor");
		clas="FY";
		per=70;
	}
	public Student(String clas, float per) {
		this.clas = clas;
		this.per = per;
	}
	
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(String name, String city,String clas, float per )
	{
		//private members can't inherited into child class
		/*
		 * super.name=name; super.city=city;
		 */
		super();
		this.clas = clas;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
	}
	private String getCity() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
