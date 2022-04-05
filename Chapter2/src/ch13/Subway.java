package ch13;

public class Subway {

	int subwayNumber;
	int money;
	int passengerCnt;
	
	public Subway(int subwayNumber)
	{
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money)
	{
		this.money += money;
		this.passengerCnt++;
	}
	
	public void showSubwayInfo()
	{
		System.out.println(subwayNumber + "번의 승객 수는 " + passengerCnt + "명 이고, 수입은 " + money + "원 입니다.");
	}
}
