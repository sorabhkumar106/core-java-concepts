import java.util.Scanner;

//creating our own custom student class
class Student{
int rollno;	
String name;
public void printDetails(){
	System.out.println("Your rollno is :"+rollno);
	System.out.println("Your name is :"+name);
		}	
}
public class CustomClass{
	public static void main(String[] args) {
//creating	object of student class
Scanner sc=new Scanner(System.in);
Student st=new Student();
System.out.print("Enter your rollno : ");
st.rollno=sc.nextInt();
System.out.print("Enter your name : ");
st.name=sc.next();
//calling student's class printDetails() function
System.out.println();
st.printDetails();
	}
}