package ch08;

public class Order {

	public String orderId;
	public String orderHpNo;
	public String address;
	public String orderDate;
	public String orderTime;
	public int orderCharge;
	public String orderMenu;
	
	public void showOrderInfo()
	{
		System.out.println("주문 접수 번호 : " + orderId);
		System.out.println("주문 핸드폰 번호 : " + orderHpNo);
		System.out.println("주문 집 주소 : " + address);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + orderCharge);
		System.out.println("메뉴 번호 : " + orderMenu);
	}

}
