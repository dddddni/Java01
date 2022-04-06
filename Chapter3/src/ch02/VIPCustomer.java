package ch02;

public class VIPCustomer extends Customer {
	
	double saleRatio;
	private String agentId;
	
	public String getAgentId() {
		return agentId;
	}

	public VIPCustomer()
	{
		saleRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
				
	}

	
}
