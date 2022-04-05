/**
 * 3)	Store at least 10 Employee Objects in an TreeSet<Employee>. When the application runs the user should be asked to select one of the options upon which you will print the employee details in a sorted manner.
For E.g.
Run Application:
a)	ID
b)	Name
c)	Department
d)	Salary
Your choice: b
<Should print all the employee’s details sorted by name>
 */


import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee {
	int id;
	String name;
	String department;
	int salary;
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "ID:"+id+" Name:"+name+" Department:"+department+" Salary:"+salary;
	}
	
}
class IdComparator implements Comparator<Employee>
{
   
    public int compare(Employee id1, Employee id2)
    {
        return id1.getId()-id2.getId();
    }
}
class NameComparator implements Comparator<Employee>
{
   
    public int compare(Employee name1, Employee name2)
    {
        return name1.getName().compareTo(name2.getName());
    }
}
class DepartmentComparator implements Comparator<Employee>
{
   
    public int compare(Employee dep1, Employee dep2)
    {
        return dep1.getDepartment().compareTo(dep2.getDepartment());
    }
}
class SalaryComparator implements Comparator<Employee>
{
   
    public int compare(Employee s1, Employee s2)
    {
        return s1.getSalary()-s2.getSalary();
    }
}
public class Collections2Q3 {

	public static void main(String[] args) {
		Employee emp0= new Employee(1,"Ashu", "eee", 10000);
		Employee emp1= new Employee(2,"Ayush", "cse", 10001);
		Employee emp2= new Employee(3,"Aasha", "mech", 10002);
		Employee emp3= new Employee(4,"rahul", "eee", 10003);
		Employee emp4= new Employee(5,"Mahesh", "it", 10004);
		Employee emp5= new Employee(6,"prem", "bigdata", 100005);
		Employee emp6= new Employee(7,"Sagar", "mba", 100006);
		Employee emp7= new Employee(8,"Alam", "arch", 710000);
		Employee emp8= new Employee(9,"Raghav", "ai", 180000);
		Employee emp9= new Employee(10,"Savati", "civil", 109000);
		
		Set<Employee> set = new TreeSet<>();
		
		System.out.print("Enter the Option by which you want to Sort Employee Details \n a.ID \n b.Name \n c.Department \n d.Salary \n:");
		Scanner scanner =new Scanner(System.in);
		String title = scanner.nextLine();
		if(title.equals("d")) {
			set = new TreeSet<>(new SalaryComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
			
		}
		else if(title.equals("a")) {
			set = new TreeSet<>(new IdComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
		}
		else if(title.equals("b")) {
			set = new TreeSet<>(new NameComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
		}
		else if(title.equals("c")) {
			set= new TreeSet<>(new DepartmentComparator());
			set.add(emp0);
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			set.add(emp5);
			set.add(emp6);
			set.add(emp7);
			set.add(emp8);
			set.add(emp9);
		}
		
		
		for(Employee it: set)
			System.out.println(it);
		scanner.close();

	}

}