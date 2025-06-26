package com.Vcube;
//POJO Class
public class AccountDetails {
	private String AccName;
	private String AccNumber;
	private double bal;
	private int Apin;
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(String accNumber) {
		AccNumber = accNumber;
	}
	public int getApin() {
		return Apin;
	}
	public void setApin(int apin) {
		Apin = apin;
	}
	
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "AccountDetails [AccName=" + AccName + ", AccNumber=" + AccNumber + ", Apin=" + Apin + "]";
	}
	public AccountDetails(String accName, String accNumber, int apin, double bal) {
		this.AccName = accName;
		this.AccNumber = accNumber;
		this.Apin = apin;
		this.bal=bal;
	}
	
	
}
