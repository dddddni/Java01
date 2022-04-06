package ch03;

public class VIPCustomer extends Customer {
	
	double saleRatio;
	private String agentId;
	
	public String getAgentId() {
		return agentId;
	}

	public VIPCustomer(int customerId, String customerName)
	{
		super(customerId, customerName);
		
		saleRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int, String) 호출");
				
	}

	
}
