package net.konic.employeeManagementSystem;

import java.util.Objects;

public class EmployeeData extends BasePerson implements Comparable<EmployeeData> {

	
	private String department;
	private static final String COMPANY_NAME = "Konic Technologies";   // encapsulation

	// --------------------------
	public EmployeeData(int id, String name, String department) {
		super(id, name);
		this.department = department;
	}

								// constructor
	@Override
	public int compareTo(EmployeeData o) {
		
		return Integer.compare(this.id, o.id);  // override the compare method. using Comparable interface.
	}

	

  
	

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static String getCompanyName() {                            // getter and setter
		return COMPANY_NAME;
	}

	// -------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(department);
		return result;                                           
	}

	

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeData other = (EmployeeData) obj;
		return Objects.equals(department, other.department);        //  @Override the hashcode,toString,equals methos.
	}

	

}
