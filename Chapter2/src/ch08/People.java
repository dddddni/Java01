package ch08;

public class People {

	// 키 몸무게 이름 나이 
	public int height;
	public int weight;
	public String name;
	public int age;
	
	public People(int height, int weight, String name, int age)
	{
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	public void showInfo()
	{
		System.out.println("키가 " + height + " 이고 몸무게가 " + weight + "인 남성이 있습니다. 이름은 " + name + "이고 나이는 " + age + "입니다.");
	}
}
