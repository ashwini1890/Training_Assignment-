/**
 * 2)	Write an application to store 10 unique product objects. In case there is an attempt to add a duplicate product, it should be silently rejected. Hint: Use HasSet or TreeSet
Extra(optional): Use ArrayList in the above solution. (This is optional)
 */

import java.util.HashSet;
import java.util.Set;

public class Collections2Q2 {

	public static void main(String[] args) {
				
		Set<Integer> number= new HashSet<>();
		number.add(100);
		number.add(102);
		number.add(103);
		number.add(104);
		number.add(105);
		number.add(106);
		number.add(107);
		number.add(108);
		number.add(109);
		
		System.out.println(number);
		
		number.add(104);
		
		System.out.println(number);

	}

}