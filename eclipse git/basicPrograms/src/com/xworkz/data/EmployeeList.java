package com.xworkz.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//increase salary by 10% if age is >25
public class EmployeeList {

	public static void main(String[] args) {
		List<EmplyeeDTO> employee = new ArrayList<EmplyeeDTO>();
		EmplyeeDTO e1 = new EmplyeeDTO("jaga", 22, 14520);
		EmplyeeDTO e2 = new EmplyeeDTO("king", 26, 14523);
		EmplyeeDTO e3 = new EmplyeeDTO("hiag", 28, 65231);
		EmplyeeDTO e4 = new EmplyeeDTO("leo", 26, 84569);

		employee.add(e4);
		employee.add(e3);
		employee.add(e2);
		employee.add(e1);

		System.out.println("before increament" + employee);
		List<EmplyeeDTO> incrementedSalary = employee.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);
			}
			return e;

		}).collect(Collectors.toList());

		System.out.println("increamented salary" + incrementedSalary);
		System.out.println("~~~~~~~~~~~");
		List<Boolean> g = employee.stream().map(e -> e.getName().endsWith("g")).collect(Collectors.toList());
		System.out.println(g);

		System.out.println("~~~~~~~~~~~~~~~");
		Map<String, List<EmplyeeDTO>> d = employee.stream().collect(Collectors.groupingBy(EmplyeeDTO::getName));  
		System.out.println(d);

	}

}
