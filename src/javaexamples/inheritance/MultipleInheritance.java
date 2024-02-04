package javaexamples.inheritance;

interface HdfcBank {
	int bankNumber = 10;
	public void totalAccounts();
	
	//	https://www.baeldung.com/java-static-default-methods
	public default void totalRevenue() {
		System.out.println("Total revenue more than 10 billion");
	}
	
	public static void totalFD() {
		System.out.println("Total number of FD are 2000");
	}
}

interface AxisBank {
	int bankNumber = 20;
	public void totalAccounts();
}

class RbiRules
{
	public void rbiPenanlty() {
		System.out.println("RBI gives penalty to banks for avoiding rules");
	}
}

public class MultipleInheritance extends RbiRules implements HdfcBank, AxisBank{
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.rbiPenanlty();
		obj.totalAccounts();
		
		System.out.println("Axis Bank Number: " + AxisBank.bankNumber);
		System.out.println("Hdfc Bank Number: " + HdfcBank.bankNumber);
		
		HdfcBank.totalFD();
		obj.totalRevenue();
	}

	@Override
	public void totalAccounts() {
		// TODO Auto-generated method stub
		
	}
}
