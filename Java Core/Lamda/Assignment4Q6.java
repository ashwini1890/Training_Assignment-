import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Q6. Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
Using replaceAll() method and Unary Operator interface write a java program which replaces evry word in the list with its upper case equivalent.
Specifications:
public class Assignment4Q6 {
    public static void main(String[] args) {}
    public List<String> convertToUpperCase(List<String> list) {}  
}
 * @author Manindra
 *
 */

public class Assignment4Q6 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	    list.add("Java");
	    list.add("JavaScript");
	    list.add("CoffeeScript");
	    list.add("HBase");
	    list.add("OpenNLP");
	    
	    printList(list,p->p.toUpperCase());
	      

	}

	private static void printList(List<String> list,UnaryOperator<String> unaryOperator) {
		
		list.replaceAll(unaryOperator);
		for (String i: list) {
			unaryOperator.apply(i);
			System.out.println(i);
		}
		
	}

}