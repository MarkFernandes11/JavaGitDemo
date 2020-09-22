package com.javapractice;

public class EmployeeAttendance {

	public static void main(String[] args) {
		int employeePresent = 1;
		
		int value = (int) ((Math.random() * 10) % 2);
		System.out.println(value);
		
		if(value == employeePresent) {
			System.out.println("Employee present");
		} else {
			System.out.println("Employee absent");
		}

	}

}
