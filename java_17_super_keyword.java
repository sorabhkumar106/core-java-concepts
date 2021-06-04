/*
*super keyword is used to access parent 
class constructor ,methods and variables
*/
class Parent{
public Parent(){
System.out.println("this parent class constructor with no arguments");	
		}
public Parent(String studentName){
	this();
System.out.println("this parent class constructor with "+studentName+" argument");
		}	
}
//inheritance
class Child extends Parent{
public Child(String studentName){
	//this line will invorked parent class constructor
	super(studentName);
	System.out.println("This child class constructor");
			}		
}
public class Main {
	public static void main(String[] args) {
		Child ch=new Child("sorabh kumar");
	}
}