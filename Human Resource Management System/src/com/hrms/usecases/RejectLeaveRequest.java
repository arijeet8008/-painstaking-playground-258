package com.hrms.usecases;

import java.util.Scanner;

import com.hrms.dao.EmployeeDao;
import com.hrms.dao.EmployeeDaoImpl;
import com.hrms.exceptions.EmployeeException;

public class RejectLeaveRequest {

//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Employee Id for Update Status :");
//		int eid = sc.nextInt();
//		
//		EmployeeDao dao = new EmployeeDaoImpl();
//		
//		try {
//			String result = dao.rejectLeave(eid);
//			System.out.println(result);
//		} catch (EmployeeException e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}

	public static void rejectleave() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id for Update Status :");
		int eid = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			String result = dao.rejectLeave(eid);
			System.out.println(result);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
