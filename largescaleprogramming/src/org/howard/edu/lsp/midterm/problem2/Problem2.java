package org.howard.edu.lsp.midterm.problem2;

class Person{
	private String name;
	private int age;
	private String socialSecurityNumber;
	
	public Person(String name, String socialSecurityNumber, int age) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Ssn: " + socialSecurityNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (socialSecurityNumber != other.socialSecurityNumber)
			return false;
		return true;
	}
	
}