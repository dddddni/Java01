package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해 주세요");
		int month = scanner.nextInt();
//		int day;
		
//		switch(month)
//		{
//			case 1 : case 3 :  case 5 : case 7 : case 8 : case 10 : case 12 :
//				day = 31;
//				break;
//			case 2:
//				day = 28;
//				break;
//			case 4 : case 6 : case 9 : case 11 :
//				day = 30;
//				break;
//			default :
//				day = -1;
//				System.out.println("존재 하지 않는 월 입니다.");
//		}
		
		// 자바 14버전 이상 처리 
//		switch(month)
//		{
//			case 1, 3, 5, 7, 8, 10, 12 -> 
//				day = 31;
//			case 2 -> 
//				day = 28;
//			case 4, 6, 9, 11 -> 
//				day = 30;
//			default ->
//			{
//				day = -1;
//				System.out.println("존재 하지 않는 월 입니다.");
//			}
//		}
		
		// 자바 14버전 이상 처리 
		int day = switch(month)
		{
			case 1, 3, 5, 7, 8, 10, 12 -> 
				31;
			case 2 -> 
				28;
			case 4, 6, 9, 11 -> 
				30;
			default ->
			{
				// 다른 수행문이 있는 경우에는 리턴 하는 값에 'yield' 라고 명시를 해줘야 함.
				System.out.println("존재 하지 않는 월 입니다.");
				yield -1;
			}
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");
		
	}

}
