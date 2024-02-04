package javaexamples.inheritance;

interface Engine1 {
	int price = 11;
	public void checkPrice();
	
}


interface Engine2 {
	int price = 23;
	public void checkPrice();
}

public class Interface extends Sem1 implements Engine1, Engine2{

	public Interface(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkPrice() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Interface obj = new Interface(2,3);
		obj.checkPrice();
		System.out.println(Engine1.price); // We can use name of interface because by default fields are static
	}
}
