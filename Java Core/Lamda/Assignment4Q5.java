
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Q5. Create a string that consists of the first letter of each word in the list of Strings provided. HINT: Use Consumer interface & a String Builder to construct the result.
Description:
Write a java program using StringBuilder and Consumer interface which will return a string. The returned string should consistes of the first let of each word in the list of words.
Specifications:
public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    public static void main(String[] args) { }
    public static String processWords(List<String> list) {}
}
 * @author Manindra
 *
 */


public class Assignment4Q5 {
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

	public static void main(String[] args) {
		PrintString(list,p->System.out.println(p));

	}

	private static void PrintString(List<String> list2,Consumer<StringBuilder> consumer) {
		StringBuilder stringBuilder = new StringBuilder();
		for(String s:list)
			stringBuilder.append(s.charAt(0));
		consumer.accept(stringBuilder);
	}

}