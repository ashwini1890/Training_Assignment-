//Q7. Develop an application for Dessert shop. The application should allow owner to add items like Candy,
// Cookie or Ice Cream in the shop storage.
// Also customers should be able to place an order.
//DessertItem is an abstract class having an abstract method getCost().
// Every dessert item has tax associated. Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency.
// The sub classes are supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer.
// If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able to place an order.
// The currency conversion rates are:
//1 dollar = 60 rupees.
//1 euro = 70 rupees.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class DesertItem {

    abstract public int getCost();
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("Candy");
        list.add("Cooky");
        list.add("IceCream");
        return list;
    }
    static int totalAmount =0;
}
class Candy extends DesertItem {
    List<String> itemList = new ArrayList<>();
    public List<String> addItem(String name) {
        itemList.add(name);
        return itemList;
    }
    public static int addCandies(int candies){
        totalAmount +=candies*60;
        return totalAmount;
    }

    @Override
    public int getCost() {

        return totalAmount;
    }

    public List<String> getList() {
        return itemList;
    }
}
class Cookie extends DesertItem {
    List<String> itemList = new ArrayList<>();
    public List<String> addItem(String name) {
        itemList.add(name);
        return itemList;
    }
    public int addCookies(int cookies){
        totalAmount += cookies*70;
        return totalAmount;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return totalAmount;
    }

    @Override
    public List<String> getList() {
        // TODO Auto-generated method stub
        return itemList;
    }
}
class IceCream extends DesertItem {
    List<String> itemList = new ArrayList<>();
    public List<String> addItem(String name) {
        itemList.add(name);
        return itemList;
    }

    public int addIceCreams(int iceCream){
        totalAmount += iceCream*70;
        return totalAmount;}

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return totalAmount;
    }

    @Override
    public List<String> getList() {
        // TODO Auto-generated method stub
        return itemList;
    }
}
class TotalCost extends DesertItem {

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return totalAmount;
    }
}
public class Assignment2Q7 {
    static Candy objCandy = new Candy();
    static Cookie objCookie = new Cookie();
    static IceCream objIceCream = new IceCream();
    static TotalCost objCost =  new TotalCost();
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        objCandy.addItem("Kimi");
        objCandy.addItem("Melody");
        objCandy.addItem("Pulse");
        objCookie.addItem("Hide and Seek");
        objCookie.addItem("GoodDay");
        objCookie.addItem("MariGold");
        objIceCream.addItem("Amul");
        objIceCream.addItem("Kwality Wall's");
        objIceCream.addItem("Arun");

        System.out.print(selectRoles());
        String role= scanner.nextLine();

        String quit = null;
        while(quit!="quit") {
            System.out.print(roles(role));
            String select = scanner.nextLine();
            if(select.equals("Add Item")) {
                System.out.print(addItems());
            }
            else if (select.equals("Display Items")) {
                System.out.print(displayItems());
            }
            else if (select.equals("Place Order")) {
                System.out.print(placeOrder());
            }
            else if (select.equals("Get Amount")) {
                System.out.print(displayTotalCost());
            }
            else if(select.equals("quit")) {
                quit="quit";
            }
        }
        System.out.println("Thank You");

    }
    private static String selectRoles(){
        return "Select Role \n\"Owner\" or \"Customer\"\n:";

    }
    private static String roles(String role){
        String Operations;
        if(role.equals("Owner")) {
            Operations="\"Add Item\" or \"Display Items\"\n(enter quit if you want to exit)\n:";
        }
        else if(role.equals("Customer")){
            Operations="\"Place Order\" or \"Get Amount\"(enter quit if you want to exit)\n:";
        }
        else {
            Operations="enter corrct role as show above";
        }
        return Operations;
    }
    private static String addItems() {
        System.out.print("Enter the Desert you want to add (i.e : Candy , Cooky , IceCream)\n:");
        String item = scanner.next();
        if(item.equals("Candy")) {
            System.out.println("Enter Name of Candy\n:");
            String candyName = scanner.next();
            objCandy.addItem(candyName);
        }
        else if (item.equals("Cooky")) {
            System.out.println("Enter Name of Cooky\n:");
            String cookyName = scanner.next();
            objCookie.addItem(cookyName);
        }
        else if(item.equals("IceCream")) {
            System.out.println("Enter Name of IceCream\n:");
            String iceCreamName = scanner.next();
            objIceCream.addItem(iceCreamName);
        }
        return item+" added successfully\n";
    }
    private static List<String> displayItems() {
        List<String> itemsList = new ArrayList<>();
        System.out.println("Enter the Desert want you to display (i.e : Candy , Cooky , IceCream)\n:");
        String item = scanner.next();
        if(item.equals("Candy"))
            itemsList=objCandy.getList();
        else if (item.equals("Cooky")) {
            itemsList=objCookie.getList();
        }
        else if(item.equals("IceCream")) {
            itemsList=objIceCream.getList();
        }
        return itemsList;
    }
    private static String placeOrder() {
        System.out.println("Enter the Desert want you to Place order (i.e : Candy , Cooky , IceCream)\n");
        String item = scanner.next();
        if(item.equals("Candy")) {
            System.out.println(objCandy.getList());
            System.out.print("Enter the candy you want from above list:");
            String candy = scanner.next();
            System.out.print("Enter the quantity you want: ");
            int quantity = scanner.nextInt();
            objCandy.addCandies(quantity);
        }
        else if (item.equals("Cooky")) {
            System.out.println(objCookie.getList());
            System.out.print("Enter the cookies you want from above list:");
            String cooky = scanner.next();
            System.out.print("Enter the quantity you want: ");
            int quantity = scanner.nextInt();
            objCookie.addCookies(quantity);
        }
        else if(item.equals("IceCream")) {
            System.out.println(objIceCream.getList());
            System.out.print("Enter the IceCream you want from above list:");
            String iceCream = scanner.next();
            System.out.print("Enter the quantity you want: ");
            int quantity = scanner.nextInt();
            objCandy.addCandies(quantity);
        }
        return item+" place Successfully\n";
    }
    private static int displayTotalCost() {
        System.out.print("Total cost Rupess: ");
        return objCost.getCost();
    }
}


