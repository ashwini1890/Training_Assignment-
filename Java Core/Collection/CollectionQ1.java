/**
 * Write a program to calculate the Simple Interest with minimal code using features of
Java 11
 * @author Ashwini 
 *
 */

interface Lambda{
	void SI(int P,int R,int T);
}
public class CollectionQ1 {

	public static void main(String[] args) {
		Lambda obj;
		obj = (P,R,T)-> System.out.println(P*R*T);
		obj.SI(100,20, 10);

	}

}