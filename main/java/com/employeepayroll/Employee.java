package com.employeepayroll;

public class Employee {
	int ID,PhoneNumber;
	String Name,Address, Department, Start, Gender;
	double BasicPay, Deductions, TaxablePay, IncomeTax, NetPay;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getStart() {
		return Start;
	}
	public void setStart(String Start) {
		Start = Start;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public double getBasicPay() {
		return BasicPay;
	}
	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}
	public double getDeductions() {
		return Deductions;
	}
	public void setDeductions(double deductions) {
		Deductions = deductions;
	}
	public double getTaxablePay() {
		return TaxablePay;
	}
	public void setTaxablePay(double taxablePay) {
		TaxablePay = taxablePay;
	}
	public double getIncomeTax() {
		return IncomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		IncomeTax = incomeTax;
	}
	public double getNetPay() {
		return NetPay;
	}
	public void setNetPay(double netPay) {
		NetPay = netPay;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", PhoneNumber=" + PhoneNumber + ", Name=" + Name + ", Address=" + Address
				+ ", Department=" + Department + ", Start=" + Start + ", Gender=" + Gender + ", BasicPay=" + BasicPay
				+ ", Deductions=" + Deductions + ", TaxablePay=" + TaxablePay + ", IncomeTax=" + IncomeTax + ", NetPay="
				+ NetPay + "]";
	}
	
	

}
