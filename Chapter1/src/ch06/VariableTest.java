package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
		// byte범위 -128 ~ 127
		byte bNum = 127;
		System.out.println(bNum);
				
		// int의 범위를 벗어
		// int num = 12345678900;
		
		// long의 범위지만, 리터럴 저장공간이 4byte이므로 해당 숫자를 표현 할 수 없
		// long lNum = 12345678900;
		
		long lNum = 12345678900L;
		System.out.println(lNum);
	}

}
