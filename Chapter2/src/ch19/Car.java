package ch19;

public class Car {
	
	private static int serialNum = 10000;
	private int id;
	
	public Car()
	{
		serialNum++;
		id = serialNum;
	}
	
	public int getCarNum()
	{
		return id;
	}
}
