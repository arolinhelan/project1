package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println(" Deposit: 10%");
}
public static void main(String[] args) {
	
AxisBank emp = new AxisBank();
emp.deposit();
emp.saving();
emp.fixed();
}}