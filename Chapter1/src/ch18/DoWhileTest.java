package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
//		System.out.println("값을 입력해 주세요 : ");
//		input = scanner.nextInt();
//		
//		while(input != 0)
//		{
//			sum += input;
//			input = scanner.nextInt();
//		}
		
		do {
			System.out.println("값을 입력해주세요 : ");
			input = scanner.nextInt();
			sum += input;
		}while(input != 0);
		
		System.out.println("총 합 : " + sum);
	}

}
