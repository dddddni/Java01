package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

		int dan = 2;
		int count = 1;
		
//		for(; dan <= 9; dan++)
//		{
//			for (count = 1; count <= 9; count++)
//			{
//				System.out.println(dan + "*" + count + "=" + dan*count);
//			}
//			
//			System.out.println();
//		}
		
		dan = 2;
		count = 1;
		
		while(dan <= 9)
		{
			count = 1;
			while(count <= 9)
			{
				System.out.println(dan + "*" + count + "=" + dan*count);
				count++;
			}
			System.out.println();
			dan++;
		}
	}

}
