package ch13;

public class Bus {
	
	int busNumber;
	int passengerCnt;
	int money;
	
	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
	}
	
	public void take(int money)
	{
		this.money += money;
		this.passengerCnt++;
	}
	
	public void showBusInfo()
	{
		System.out.println(busNumber + "번 버스의 승객 수는 " + passengerCnt + "명 이고, 수입은 " + money + "원 입니다.");
	}
	
}
