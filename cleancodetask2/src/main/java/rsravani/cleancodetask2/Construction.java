package rsravani.cleancodetask2;

public class Construction {
	String material_standard;
	double total_area;
	boolean fully_automated;
	Construction(String material_standard, double total_area, boolean fully_automated)
	{
		this.material_standard=material_standard;
		this.total_area=total_area;
		this.fully_automated=fully_automated;
	}
	public double getCost()
	{
		switch(material_standard)
		{
		case "above_standard": return cost_with_above_standard();			
		case "high_standard": return cost_with_high_standard();		
		default: return cost_with_standard();			
		}
	}
	private double cost_with_standard() {
		return 1200*total_area;
	}
	private double cost_with_above_standard() {
		return 1500*total_area;
	}
	private double cost_with_high_standard() {
		if(fully_automated)
		{
			return 2500*total_area;
		}
		else
		{
			return 1800*total_area;
		}
	}
}
