package com.hrms.usecases;

import java.util.List;

import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImpl;
import com.hrms.exceptions.DepartmentException;
import com.hrms.model.Department;

public class PrintAllDepartments {

//	public static void main(String[] args) {
//		
//		DepartmentDao dao = new DepartmentDaoImpl();
//		
//		try {
//			
//			List<Department> department = dao.getAllDepartmentDetails();
//			department.forEach(d -> System.out.println(d));
//			
//		} catch (DepartmentException e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
	
	public static void allDepartments() {
		
		DepartmentDao dao = new DepartmentDaoImpl();
		
		try {
			
			List<Department> department = dao.getAllDepartmentDetails();
			for (Department d : department) {
				System.out.println("Department Id : "+d.getDid());
				System.out.println("Department Name :"+d.getDname());
				System.out.println("================");
			}
			
		} catch (DepartmentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
