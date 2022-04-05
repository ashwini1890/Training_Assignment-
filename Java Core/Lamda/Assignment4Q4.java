/**
 * Q4. Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.
Description:-
Write a program using java 8 features which can remove the odd length words from the list.
Specifications:
public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){}
    public static void main(String[] args) { }
}
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Words{
	String word;

	public Words(String word) {
		super();
		this.word = word;
	}
	

	public void setWord(String word) {
		this.word = word;
	}


	public String getWord() {
		return word;
	}
	public String toString() {
		return word;
		
	}
	
}
public class Assignment4Q4 {

	public static void main(String[] args) {
		Words word1 = new Words("Naga");
		Words word2 = new Words("Manindra");
		Words word3 = new Words("Krishna");
		Words word4 = new Words("Abhi");
		Words word5 = new Words("Chaithanya");
		
		List<Words> wordsList = new ArrayList<>();
		wordsList.add(word1);
		wordsList.add(word2);
		wordsList.add(word3);
		wordsList.add(word4);
		wordsList.add(word5);
		
		
		PrintWords(wordsList,p->p.getWord().length()%2!=0);

	}

	private static void PrintWords(List<Words> wordsList,Predicate<Words> predicate) {
		wordsList.removeIf(predicate);
		for(Words words:wordsList) {
			
			System.out.println(words);
		}
	}

}