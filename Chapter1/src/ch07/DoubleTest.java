package ch07;

public class DoubleTest {

	public static void main(String[] args) {

		double dNum = 3.14;
		
		//실수형은 double이 기본이기 때문에, 8byte 리터럴 값을 float 4byte에 넣으려고 하면 오류가 남.
		//long type처럼 f/F를 표시해야함.
		float  fNum = 3.14f;
		
		System.out.println(dNum);
		System.out.println(fNum);
	}

}
