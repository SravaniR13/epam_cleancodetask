package rsravani.cleancodetask1;

public class Deposit {
	double principal, timePeriod, rateOfInterest;
	Deposit(double principal, double timePeriod, double rateOfInterest)
	{
		this.principal=principal;
		this.timePeriod= timePeriod;
		this.rateOfInterest=rateOfInterest;
	}
	public double getSimpleInterest()
	{
		return (principal*timePeriod*rateOfInterest)/100;
	}
	public double getCompondInterest()
	{
		return principal*Math.pow( (1+(rateOfInterest/100)) , timePeriod)-principal;
	}
}
