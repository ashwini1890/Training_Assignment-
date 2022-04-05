/**
 * 1)	Given a TreeMap<Long, Contact> which has phone numbers for keys and contact objects for values.
Write solutions to 
a.	Fetch all the keys and print them, 
b.	Fetch all the values and print them
c.	Print all key-value pairs
Note: 
a)	Contacts should be stored in descending order of phone number
b)	Contact Class:
•	PhoneNumer: <long>
•	Name: <String>
•	Email: <String>
•	Gender: <Enum>
 */


import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Details implements Comparable<Details>{
	private String name;
	private String email;
	private String gender;
	
	public Details(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Email:"+email+" Gender:"+gender;
	}
	@Override
	public int compareTo(Details o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
}

class phoneNumber implements Comparable<phoneNumber>{
	private long number;

	public phoneNumber(long number) {
		super();
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}

	public String toString() {
		return String.valueOf(number);
		
	}
	

	@Override
	public int compareTo(phoneNumber o) {
		// TODO Auto-generated method stub
		return this.toString().compareTo(o.toString());
	}
	
	
}
public class Collections2Q1 {

	public static void main(String[] args) {
		Details D1 = new Details("Ashu", "as@gmail.com", "Female");
		Details D2 = new Details("Manindra", "ma@gmail.com", "Male");
		Details D3 = new Details("Aayushman", "ayush.com", "Male");
		Details D4 = new Details("Anshima", "ah@gmail.com", "Female");
		Details D5 = new Details("Abhi", "ab@gmail.com", "Male");
		
		phoneNumber P1 = new phoneNumber(9510062633l);
		phoneNumber P2 = new phoneNumber(8825962633l);
		phoneNumber P3 = new phoneNumber(9835962633l);
		phoneNumber P4 = new phoneNumber(9545965533l);
		phoneNumber P5 = new phoneNumber(9565762633l);
		
		Map<phoneNumber, Details> map = new TreeMap<>();
		
		map.put(P1,D1);
		map.put(P2,D2);
		map.put(P3,D3);
		map.put(P4,D4);
		map.put(P5,D5);
		
	
		Set<Entry<phoneNumber, Details>> entrySet = map.entrySet();

	    int index = 0;
	    for (Entry<phoneNumber, Details> currentEntry :entrySet) {
	        System.out.println("Key at " + index + ":"+ currentEntry.getKey());
			index++;
			}
	    int index2=0;
	    for (Entry<phoneNumber, Details> currentEntry :entrySet) {
	        System.out.println("Value at " + index2 + ":"+ currentEntry.getValue());
			index2++;
			}
	    
        
        for (Entry<phoneNumber, Details> entry : map.entrySet()) {     
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	    	
	    }
	}

}