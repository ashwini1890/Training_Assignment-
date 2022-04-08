/**
 * Build a custom annotation called @Info, which can be used by developers on a class, a
property, or a method. The developer can provide the following information when using this
annotation:
a) AuthorID: <<Developers ID>> - (Mandatory Input)
b) Author: <<Developers name>> - (Optional Input)
c) Supervisor: <<Developers Supervisor>> - (Optional Input)
d) Date: <<”String Date”>> - (Mandatory Input)
e) Time: <<”String Time”>> - (Mandatory Input)
f) Version: <<Numerical Version >> - (Mandatory Input)
g) Description: <<Description of the class, method, or property >> - (Optional Input) 
 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int AuthorID();
	String Author();
	String Date();
	String Time();
	float Version();
}

@info(AuthorID=0, Author = "Naga", Date = "22-02-2022", Time = "07:00", Version = 1.2f)
class Developer{
	int AuthorID;
	String Author;
	String Date;
	String Time;
	float Version;
	public Developer(int i, String string, String date, String time, float d) {
		super();
		AuthorID = i;
		Author = string;
		Date = date;
		Time = time;
		Version = d;
	}
	public String toString() {
		return "AuthorID:"+AuthorID+" Author:"+Author+" Date:"+Date+" Time:"+Time+" Version:"+Version;
	}
}
public class AnnotationQ2 {

	public static void main(String[] args) {
		Developer dep = new Developer(123,"Naga", "22-02-2022", "07:00", 1.2f);
		System.out.println(dep.toString());

	}

}