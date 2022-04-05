package ch15;

public class TakeTaxiTest {

	public static void main(String[] args) {

		Person person = new Person("Edward" , 20000);
		
		Taxi taxi = new Taxi("잘 나간다 운수");
		person.takeTaxi(taxi, 5000);
		
		person.showInfo();
		taxi.showInfo();
		
	}

}
