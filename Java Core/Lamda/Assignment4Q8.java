import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Q8. Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.
Description:-
Write a java program which will print the list of number using Thread and interface Consumer.
Specifications:
public class Assignment4Q8 {}
 * @author Manindra
 *
 */


public class Assignment4Q8 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		Print(list,p->System.out.println(p));

	}

	private static void Print(List<Integer> list,Consumer<Integer> consumer) {
		Thread thread =new Thread(()-> {
				for (Integer i:list)
					consumer.accept(i);
				
			}
		);
		thread.start();
		
	}

}