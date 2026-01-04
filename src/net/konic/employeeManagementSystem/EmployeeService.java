package net.konic.employeeManagementSystem;

import java.util.*;

public class EmployeeService {

	
	//Q1. addEmployees()
	public List<EmployeeData> addEmployees() {

		List<EmployeeData> list = new ArrayList<>();

		list.add(new EmployeeData(102, "Hussain", "IT"));
		list.add(new EmployeeData(104, "Sahil", "Admin"));
		list.add(new EmployeeData(101, "Srikanth", "IT"));
		list.add(new EmployeeData(103, "Khadeer", "HR"));
		list.add(new EmployeeData(105, "Wasif", "Finance"));
		list.add(new EmployeeData(101, "Srikanth", "IT")); // duplicates allowed.

		return list;
	}

	
	//Q2. Remove duplicates
	
	public Set<EmployeeData> removeDuplicateEmployees(List<EmployeeData> list) {
		 

		Set<EmployeeData> set = new HashSet<>(list);   // duplicates not allowed.
		return set;
		
	}
	
	//Q3.Sort Employees
	
	public List<EmployeeData> sortEmployees(List<EmployeeData> list) {

        Collections.sort(list);
        return list;
    }
   //Q4.storeInLinkedHashMap()
	public Map<Integer, EmployeeData> storeInLinkedHashMap() {
		Map<Integer,EmployeeData> map = new LinkedHashMap<>();
		
		map.put(1, new EmployeeData(101,"Srikanth","IT"));
		map.put(2,new EmployeeData(102,"Hussain","IT"));
		map.put(4,new EmployeeData(104, "Sahil","Admin"));
		map.put(3,new EmployeeData(103, "Khadeer", "HR"));
		map.put(5,new EmployeeData(105, "Wasif", "Finance"));
		map.put(1, new EmployeeData(101,"Srikanth","IT"));
		
		for (Map.Entry<Integer, EmployeeData> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

        return map;
    }
	
	//Q5. storeInTreeMap()
	
	public Map<Integer, EmployeeData> storeInTreeMap() {

        Map<Integer, EmployeeData> map = new TreeMap<>();
        map.put(1, new EmployeeData(101,"Srikanth","IT"));
		map.put(2,new EmployeeData(102,"Hussain","IT"));
		map.put(4,new EmployeeData(104, "Sahil","Admin"));
		map.put(3,new EmployeeData(103, "Khadeer", "HR"));
		map.put(5,new EmployeeData(105, "Wasif", "Finance"));
		map.put(1, new EmployeeData(101,"Srikanth","IT"));
		
		for (Map.Entry<Integer, EmployeeData> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + entry.getValue());
		}


        return map;
    }
	
	//Q6.getEmployeeById(int id)
	//Retrieve employee using Map.
	public EmployeeData getEmployeeById() {
		 Map<Integer, EmployeeData> map = new TreeMap<>();
	        map.put(1, new EmployeeData(101,"Srikanth","IT"));
			map.put(2,new EmployeeData(102,"Hussain","IT"));
			map.put(4,new EmployeeData(104, "Sahil","Admin"));
			map.put(3,new EmployeeData(103, "Khadeer", "HR"));
			map.put(5,new EmployeeData(105, "Wasif", "Finance"));
			map.put(1, new EmployeeData(101,"Srikanth","IT"));
			
			return map.get(2);
	}
	
	

	// Q7. removeEmployeeSafely()
	//Remove employee using Iterator.remove().
	
	 public List<EmployeeData> removeEmployeeSafely(List<EmployeeData> list){
		 
		 
		 Iterator<EmployeeData> itr = list.iterator();

			while (itr.hasNext()) {

				EmployeeData emp = itr.next();

				if (emp.getId() == 101) {

					itr.remove();  //When it finds  employee  ID 101 it safely removes the employee.

				}
			}
			return list;
			
			
			
			
			
	 }
	
	
	
	
	
	
	
	
	
	
	
}
