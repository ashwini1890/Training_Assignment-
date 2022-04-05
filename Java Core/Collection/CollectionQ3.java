/**
 * “A quick brown fox jumps over the lazy dog”. Create an ArrayList from the given
String. Such an ArrayList should include each word from the given sentence. Finally
convert such List to an array using Java 11 methods and print the output.
 */

import java.util.ArrayList;
import java.util.List;

public class CollectionQ3 {

	public static void main(String[] args) {
		String string ="A quick brown fox jumps over the lazy dog";
		String[] splitArray = string.split(" ");
		List<String> splitList = new ArrayList<>();
		for (String i : splitArray) {
			splitList.add(i);
		}
		System.out.println(splitList);
		String[] arraySplit = new String[splitList.size()];
		splitList.toArray(arraySplit);
		for(String k : arraySplit)
			System.out.println(k);

	}

}