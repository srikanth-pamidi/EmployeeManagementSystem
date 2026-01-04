package net.konic.employeeManagementSystem;

import java.util.Objects;

/*
 * 🔹 CLASS 1: BasePerson.java
Purpose
Common parent class.
Fields
Copy code

protected int id;
protected String name;
Why?
Demonstrates Inheritance
Avoids code duplication
 */
public class BasePerson {

	protected int id;
	protected String name;

	public BasePerson(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BasePerson [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasePerson other = (BasePerson) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
