package javaexamples.collections;

import java.util.Objects;

public class Student {
	String name;
	int rollno;
	
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

//	@Override
//	public int compareTo(Student that) {
//		return this.rollno - that.rollno;
//	}
}