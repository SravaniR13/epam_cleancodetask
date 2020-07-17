package rsravani.cleancodetask2;

public class ClientForConstruction {
	public static void main(String[] args)
	{
		Construction flat1 = new Construction("standard",2100, false);
		Construction flat2 = new Construction("high_standard",1500, true);
		Construction flat3 = new Construction("above_standard",1800, false);
		Construction flat4 = new Construction("high_standard",2300, false);
		System.out.println("Cost of building with standard materials: "+flat1.getCost());
		System.out.println("Cost of building with above standard materials: "+flat3.getCost());
		System.out.println("Cost of building with high standard materials: "+flat4.getCost());
		System.out.println("Cost of fully automated flat building with standard materials: "+flat2.getCost());
	}
}
