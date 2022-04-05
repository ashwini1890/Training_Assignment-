import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Q3. Use the functional interfaces Supplier, Consumer, Predicate & Function to invoke built-in methods from Java API.
Description:
Write a program using the Java API’s mentioned in the question.
Specifications:
public class Assignment4Q3 {
    static void modifyValue(){  }
    static class Product { }
    static void display() { }
    public static void main(String[] args) {
}
 * @author Manindra
 *
 */
public class Assignment4Q3 {

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
		
		printAll(ordrList,condition->condition.getStatus().startsWith("A") && condition.getPrice()>10000,()->ordrList.get(3),x->x.getPrice(),p->System.out.println(p));

	}

	private static void printAll(List<orderDetails> ordrList,Predicate<orderDetails> predicate,Supplier<orderDetails> supplier,Function<orderDetails, Integer> function,Consumer<orderDetails> consumer) {
		Map<Integer,String> list2 = new HashMap<>();
		for(orderDetails iDetails : ordrList) {
			list2.put(function.apply(iDetails),iDetails.getStatus());
			if(predicate.test(iDetails)) {
				consumer.accept(iDetails);
			}
		}
		System.out.println(supplier.get());
		System.out.println(list2);
		
				
		
	}

}
