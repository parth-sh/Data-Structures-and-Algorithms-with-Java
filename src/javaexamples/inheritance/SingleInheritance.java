package javaexamples.inheritance;

class Sem1 {
	private int c, math, eng;
	
	public Sem1(int a, int b) {
		System.out.println("Default constructor of Sem1");
	}
	
	public void input1() {
		c = 77;
		math = 56;
		eng = 87;
	}
	
	public void output1() {
		System.out.println("Semester 1");
		System.out.println("Marks in C language" + c);
		System.out.println("Marks in Mathematics language" + math);
		System.out.println("Marks in English language" + eng);
		
		int totalMarks = math + eng + c;
		System.out.println("Total marks in semester-1: " + totalMarks);
	}
}

class Sem2 extends Sem1 { // Inheriting all features of Sem1
	private int cpp, dsa, se;
	
	public Sem2(int x) {
		super(1, 2);
		System.out.println("Default constructor of Sem2");
	}
	
	public void input2() {
		cpp = 87;
		dsa = 82;
		se = 92;
	}
	
	public void output2() {
		System.out.println("Semester 2");
		System.out.println("Marks in CPP language" + cpp);
		System.out.println("Marks in Data Structure" + dsa);
		System.out.println("Marks in Software Engineer" + se);
		
		int totalMarks = cpp + dsa + se;
		System.out.println("Total marks in semester-2: " + totalMarks);
	}
}

class Sem3 extends Sem2 { // Inheriting all features of Sem1
	private int cg, java, angular;
	
	public Sem3() {
		super(12);
		System.out.println("Default constructor of Sem3");
	}
	
	public void input3() {
		cg = 72;
		java = 66;
		angular = 87;
	}
	
	public void output3() {
		System.out.println("Semester 3");
		System.out.println("Marks in CG language" + cg);
		System.out.println("Marks in Java" + java);
		System.out.println("Marks in Angular" + angular);
		
		int totalMarks = cg + java + angular;
		System.out.println("Total marks in semester-3: " + totalMarks);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Sem3 sem = new Sem3();
//		sem.input1();
//		sem.input2();
//		sem.input3();
//		
//		sem.output1();
//		sem.output2();
//		sem.output3();
	}
}
