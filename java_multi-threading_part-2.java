class Student implements Runnable{
	
public void run(){
	int i=0;
	while(i<6){
System.out.println("Sorabh kumar is student");		
	i++;
	}
}
class Employee implements Runnable{
	
public void run(){
	int i=0;
	while(i<6){
System.out.println("Sorabh kumar is employee");		
	i++;
	}
		}	
}
public class Main {
	public static void main(String[] args) {
Student s1=new Student();
Student s2=new Student();
	Thread t1=new Thread(s1);
	Thread t2=new Thread(s2);	
	t1.start();
	System.out.println();
	t2.start();
	System.out.println();
	}
}