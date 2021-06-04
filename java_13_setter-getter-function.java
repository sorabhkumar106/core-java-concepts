/*
* getter and setter function in java
* accses modifier in java ->
* there are four accses modifier in java
* accses modifier are used with class function and variable
* public ( public function ,variable and class are accsesible to all clases and package)
* private (private function ,variable and class are accsesible within a class )
* protected (protrcted function ,variable and class are accsesible to within class and  inheriting classes)
* default (default function ,variable and class are accsesible  within class and it's ' package)
*/
class Student{
private int rollno;
private String name;
//setter function setting roll no
public void setRollno(int r){
	rollno=r;
		}
//getter function getting roll no
public int getRollno(){
return rollno;	
}
public void setName(String n){
name=n;	
}
public String getName(){
return name;	
}
}
public class Main {
	public static void main(String[] args) {
		//creating object of student class
		Student sorabh=new Student();
		sorabh.setRollno(22);
		sorabh.setName("Sorabh kumar");
		System.out.println("your rollno is "+sorabh.getRollno());
		System.out.println("Your name is "+sorabh.getName());
	}
}