import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Fruit { 
	String name; 
	int calories; 
	int price; 
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getCalories() {
		return calories;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Fruit [Name:"+name+" Calories:"+calories+" Price:"+price+" Color:"+color+"]";
	}
}

class News { 
	int newsId; 
	String postedByUser; 
	String commentByUser; 
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	} 
	
	public String toString() {
		return "News [NewID:"+newsId+" PostedByUser:"+postedByUser+" CommentByUser:"+commentByUser+" Comment:"+comment+"]";
	}
}
class Trader { 
	String name; 
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	} 
	public String toString() {
		return "Trader [Name:"+name+" City:"+city+"]";
	}
	
}

class Transaction { 
	Trader trader; 
	int year; 
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	} 
	
	public String toString() {
		return "Transaction [Trader:"+trader+" Year:"+year+" Value:"+value+"]";
	}

}
public class StreamAssignment {

	public static void main(String[] args) {
		Fruit fruit1 = new Fruit("Apple", 52, 100, "Red");
		Fruit fruit2 = new Fruit("Banana", 111, 50, "Yellow");
		Fruit fruit3 = new Fruit("Grapes", 104, 75, "Green");
		Fruit fruit4 = new Fruit("Papaya", 215, 60, "Orange");
		Fruit fruit5 = new Fruit("StrawBerries", 49, 150, "Pink");
		Fruit fruit6 = new Fruit("Mango", 202, 150, "Yellow");
		Fruit fruit7 = new Fruit("Pomegranate", 234, 80, "Red");
		
		List<Fruit> fruitList= new ArrayList<>();
		fruitList.add(fruit1);
		fruitList.add(fruit2);
		fruitList.add(fruit3);
		fruitList.add(fruit4);
		fruitList.add(fruit5);
		fruitList.add(fruit6);
		fruitList.add(fruit7);
		
		News news1 =new News(111, "TV9", "Mohan", "Today whether will be sunny ,budget is $.........");
		News news2 =new News(112, "ABN", "RK", "Today whether will be Rainy");
		News news3 =new News(113, "TV5", "Mallana", "Today whether will be cold");
		News news4 =new News(114, "NTV", "Krishna", "Today whether will be windy,budget is $.........");
		News news5 =new News(111, "TV9", "Mohan", "All collages open today");
		News news6 =new News(111, "TV9", "Mohan", "Covid cases increased,budget is $.........");
		
		List<News> newsList=new ArrayList<>();
		newsList.add(news1);
		newsList.add(news2);
		newsList.add(news3);
		newsList.add(news4);
		newsList.add(news5);
		newsList.add(news6);
		
		Trader tader1=new Trader("Yogesh", "Chittor");
		Trader tader2=new Trader("Krishna", "Amaravathi");
		Trader tader3=new Trader("Abhi", "Vizac");
		Trader tader4=new Trader("Ali", "Nandyal");
		Trader tader5=new Trader("Pavan", "Kurnool");
		Trader tader6=new Trader("Naga", "Kurnool");
		
		List<Trader> tradeList =new ArrayList<>();
		tradeList.add(tader1);
		tradeList.add(tader2);
		tradeList.add(tader3);
		tradeList.add(tader4);
		tradeList.add(tader5);
		tradeList.add(tader6);
		
		Transaction transaction1=new Transaction(tader1, 2018, 99);
		Transaction transaction2=new Transaction(tader2, 2022, 98);
		Transaction transaction3=new Transaction(tader3, 2011, 97);
		Transaction transaction4=new Transaction(tader4, 2017, 96);
		Transaction transaction5=new Transaction(tader5, 2011, 95);
		Transaction transaction6=new Transaction(tader6, 2012, 94);
		
		List<Transaction> transactionList=new ArrayList<>();
		transactionList.add(transaction1);
		transactionList.add(transaction2);
		transactionList.add(transaction3);
		transactionList.add(transaction4);
		transactionList.add(transaction5);
		transactionList.add(transaction6);
		
		System.out.println("1.Display the fruit names of low calories fruits i.e. calories < 100 sorted in\n"
				+ "descending order of calories.");
		fruitList.stream().filter(p->p.getCalories()<100).sorted((a,b)->b.getCalories()-a.getCalories()).forEach(p->System.out.println(p));
		
		System.out.println("\n2.Display color wise list of fruit names:");
		fruitList.stream().sorted((a,b)->a.getColor().compareTo(b.getColor())).forEach(p->System.out.println(p.getColor()+" "+p.getName()));;
		
		System.out.println("\n3.Display only RED color fruits sorted as per their price in ascending order:");
		fruitList.stream().filter(p->p.getColor().equals("Red")).sorted((a,b)->a.getPrice()-b.getPrice()).forEach(p->System.out.println(p));;
		
		System.out.println("\n4.Find out the newsId which has received maximum comments:");
		/**News maxOccurredElement=newsList.stream().reduce(BinaryOperator.maxBy((o1, o2) -> Collections.frequency(newsList, o1) -
                Collections.frequency(newsList, o2))).orElse(null);
		System.out.println(maxOccurredElement);**/
		newsList.stream().collect(Collectors.groupingBy(s -> s.getNewsId(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
		
		System.out.println("\n5.Find out how many times the word 'budget' arrived in user comments all\r\n"
				+ "news:");
		long countNews= newsList.stream().filter(p->p.getComment().contains("budget")).count();
		System.out.println(countNews);
		
		System.out.println("\n6.Find out which user has posted maximum comments:");
		newsList.stream().collect(Collectors.groupingBy(s -> s.getPostedByUser(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Comparator.comparing(Entry::getValue))
	      .ifPresent(System.out::println);
		
		System.out.println("\n7.Display commentByUser wise number of comments.");
		newsList.stream().collect(Collectors.groupingBy(s -> s.getCommentByUser(), Collectors.counting()))
	      .entrySet()
	      .stream().forEach(p->System.out.println(p));
		
		System.out.println("\n8.Find all transactions in the year 2011 and sort them by value (small to\r\n"
				+ "high).");
		transactionList.stream().filter(p->p.getYear()==2011).sorted((a,b)->a.getValue()-b.getValue()).forEach(p->System.out.println(p));
		
		System.out.println("\n9.What are all the unique cities where the traders work?");
		tradeList.stream().distinct().collect(Collectors.groupingBy(s -> s.getCity())).entrySet().stream().forEach(p->System.out.println(p.getKey()));
		
		System.out.println("\n10.Find all traders from Kurnool and sort them by name?");
		tradeList.stream().filter(p->p.getCity().equals("Kurnool")).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(p->System.out.println(p));
		
		System.out.println("\n11.Return a string of all traders names sorted alphabetically?");
		//tradeList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(p->System.out.println(p));
		String string=tradeList.stream().sorted((a,b)->a.getName().compareTo(b.getName())).map(p->p.getName()).reduce("", (n1, n2) -> n1 + n2);
		System.out.println(string);
		
		System.out.println("\n12.Are any traders based in Indore?.");
		tradeList.stream().filter(p->p.getCity().equals("Indore")).sorted((a,b)->a.getName().compareTo(b.getName())).forEach(p->System.out.println(p));
		
		System.out.println("\n13.. Print all transactions values from the traders living in Kurnool.");
		transactionList.stream().filter(p->p.trader.getCity().equals("Kurnool")).forEach(p->System.out.println(p.getValue()));
		
		System.out.println("\n14.Whats the highest value of all the transactions?");
		transactionList.stream().mapToInt(Transaction::getValue).max().ifPresent(System.out::println);
		
		System.out.println("\n15.Whats the lowest value of all the transactions?");
		transactionList.stream().mapToInt(Transaction::getValue).min().ifPresent(System.out::println);
		
		
	}

}