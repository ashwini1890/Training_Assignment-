import java.util.ArrayList;
import java.util.List;

/**
 * Q2. Write an application using lambda expressions to print Orders having 2 criteria implemented: 1) order price more than 10000 2) order status is ACCEPTED or COMPLETED.
Description:
Write a program in such a way that it has a method which returns the list of orders satisfying the 2 conditions mentioned in the question.
Specifications:
import java.util.ArrayList;
public class Assignment4Q2 {
    private int totalPrice;
    private String status;
    public static ArrayList<Assignment4Q2> listOfOrders(ArrayList<Assignment4Q2> orders) {}
    public static void main(String[] args) {}
}
 * @author Manindra
 *
 */

class orderDetails{
	int price;
	String status;
	public orderDetails(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public String getStatus() {
		return status;
	}
	public String toString() {
		return "Price:"+price+" Status:"+status;
	}
	
}

public class Assignment4Q2 {

	public static void main(String[] args) {
		orderDetails obj0 = new orderDetails(15000, "Accepted");
		orderDetails obj1 = new orderDetails(5000, "Accepted");
		orderDetails obj2 = new orderDetails(25000, "notAccepted");
		orderDetails obj3 = new orderDetails(2000, "notAccepted");
		orderDetails obj4 = new orderDetails(55000, "Accepted");
		orderDetails obj5 = new orderDetails(105000, "Accepted");
		
		List<orderDetails> ordrList = new ArrayList<>();
		ordrList.add(obj0);
		ordrList.add(obj1);
		ordrList.add(obj2);
		ordrList.add(obj3);
		ordrList.add(obj4);
		ordrList.add(obj5);
		
		printAll(ordrList,condition->condition.getStatus().startsWith("A") && condition.getPrice()>10000);

	}

	private static void printAll(List<orderDetails> ordrList,Condition condition) {
		// TODO Auto-generated method stub
		for(orderDetails iDetails : ordrList)
			if(condition.test(iDetails))
				System.out.println(iDetails);
		
	}

}
interface Condition{
	boolean test(orderDetails iDetails);
}