package rsravani.cleancodetask1;

public class ClientForDeposit {
	public static void main(String[] args)
	{
		Deposit mydeposit= new Deposit(50000,2.5,8.5);
		System.out.println("Simple Interest: "+mydeposit.getSimpleInterest());
		System.out.println("Compound Interest: "+mydeposit.getCompondInterest());
	}
}
