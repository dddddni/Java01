package ch15;

public class Taxi {
	String companyName;
	int money;
	
	public Taxi(String companyName)
	{
		this.companyName = companyName;
	}
	
	public void take(int money)
	{
		this.money += money;
	}
	
	public void showInfo()
	{
		System.out.println(companyName + "의 수입은 " + money + "원 입니다.");
	}
	
	

}
