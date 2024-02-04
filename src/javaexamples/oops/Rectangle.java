package javaexamples.oops;

public class Rectangle {
	
	int length; //data member, instance variable, fields
	
	int width;
	
	static int shapeVolume; 
	//	static means share common memory among all objects (saves memory)
	//	static we can call directly via class names object not required
	
	public void input() { // member functions
		length = 10;
		width = 20;
	}
	
	public void output() {
		System.out.println("Length of rectangle: " + length);
		System.out.println("Width of rectangle: " + width);
		int area = result(length, width);
		System.out.println("Area of the rectangle: " + area);
	}
	
	public void show(int price) {
		System.out.println("Price is:" + price);
	}
	
	public int result(int length, int width) {
		return length * width;
	}
	
	public static void main(String[] args) {
		// Object contain 3 properties data-member, member functions, identity
		// hashCode(), equals() are part of Object class 	
		Rectangle obj = new Rectangle();
		obj.show(22);
		obj.input();
		obj.output();
		
		System.out.println("Object identity: " + obj.hashCode());
		System.out.println("Shape voume: "+Rectangle.shapeVolume);
	}
	static {
		System.out.println("Static block");
	}
}


