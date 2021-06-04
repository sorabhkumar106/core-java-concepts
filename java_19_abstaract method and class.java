/*
*java abstract class and abstract method
*abstract method is a type of method that 
hava abstarct keyword and only define 
method signature 
*impelementation of abstarct method is define
in child class
*abstract class hava abstract keyword that show's
this class contains abstract method and simple method as well
*we can't create object of abstract class but
we inherite that class and create object of inherited class

*/
//abstract class
abstract class Pen{
	public void show(){
		System.out.println("this abstract class");
			}
			//abstract methods
		abstract void refil();
		abstract void write();	
}
class Writer extends Pen{
public void refil(){
	System.out.println("Adding refil");
		}	
	public void write(){
System.out.println("writing content");		
	}
}
public class Main {
	public static void main(String[] args) {
		//this will throgh error
		//Pen p=new Pen();
		Writer w=new Writer();
		w.refil();
		w.write();
	}
}