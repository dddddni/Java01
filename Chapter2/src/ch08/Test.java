package ch08;

public class Test {

	public static void main(String[] args) {

		People people = new People(180, 78, "Tomas", 37);
		people.showInfo();
		System.out.println();
		
		Order order = new Order();
		order.orderId = "202011020003";
		order.orderHpNo = "01023450001";
		order.address = "서울시 강남구 역삼동 111-333";
		order.orderDate = "20201102";
		order.orderTime = "130258";
		order.orderCharge = 35000;
		order.orderMenu = "0003";
		
		order.showOrderInfo();
	}

}
