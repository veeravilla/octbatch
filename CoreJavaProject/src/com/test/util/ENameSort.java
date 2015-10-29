package com.test.util;

import java.util.Comparator;

import com.test.oops.Employee;

public class ENameSort  implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEname().compareTo(emp2.getEname());
	}

}
