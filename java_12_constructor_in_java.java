/*
*constructor is special type function that used 
to intialize argument of a class.
* constructor has not any return type
* Name of the constructor will be the same as class 
Name
* cinstructor executed when we create object of a 
class
*/
class Base{
//base class constructor with no arguments
public Base(){
System.out.println("I am base class Constructor");	
}
//base class constructor with arguments
public Base(String name){
System.out.println(name+" calling this constructor");	
}
}
public class Main {
	public static void main(String[] args) {
	Base base1=new Base();	
	Base base2=new Base("sorabh kuamar");
	}
}