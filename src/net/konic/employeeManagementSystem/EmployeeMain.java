package net.konic.employeeManagementSystem;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeService obj = new EmployeeService();
		// Q1.Add at least 5 employees to List.
		System.out.println("Employee Details :");
		System.out.println("========================================");
		List<EmployeeData> list = obj.addEmployees();
		System.out.println(list + "\n"); // it allows duplicate.

		// =============================================

		// Q2. Convert List to Set and return unique employees.
		System.out.println("Remove duplicate employee : ");
		System.out.println("========================================");
		Set<EmployeeData> remove = obj.removeDuplicateEmployees(list);
		System.out.println(remove + "\n");

		// Q3.Sort employees using Comparable.
		System.out.println("Sort Employees :");
		System.out.println("========================================");
		List<EmployeeData> sort = obj.sortEmployees(list);
		System.out.println(sort + "\n");

		// Q4. Store employees using ID as key and preserve insertion order.
		System.out.println("Store Employees using ID as Key :");
		System.out.println("========================================");
		Map<Integer, EmployeeData> Key = obj.storeInLinkedHashMap();
		System.out.println("\n");

		// Q5. Store employees in TreeMap and prove automatic sorting.
		System.out.println("Store Employees in TreeMap for automatic sorting :");
		System.out.println("========================================");
		Map<Integer, EmployeeData> treeMap = obj.storeInTreeMap();
		System.out.println("\n");

		// Q6. Retrieve employee using Map.
		System.out.println("Retrieve employee using Key :");
		System.out.println("========================================");
		EmployeeData retrieve = obj.getEmployeeById();
		System.out.println(retrieve + "\n");

		// Q7. removeEmployeeSafely()
		// Remove employee using Iterator.remove().
		System.out.println("Rmove employee");
		System.out.println("========================================");
		List<EmployeeData> removeEmployee = obj.removeEmployeeSafely(list);
		System.out.println(removeEmployee + "\n");

		// Q8.explainFailFast()

		System.out.print("FailFast : ");
		System.out.println(
				"If the collection is changed (add or remove) during iteration, Java immediately throws a ConcurrentModificationException.");
		System.out.println(
				"This happens because the iterator works on the original collection and expects it not to change.");
		System.out.println("Fail-fast helps detect programming errors early and avoids unpredictable results.");

	}

}
