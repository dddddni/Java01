package ch11;

public class MakeReportTest {

	public static void main(String[] args) {

		MakeReport builder = new MakeReport();
		String result = builder.getReport();
		
		System.out.println(result);
	}

}
