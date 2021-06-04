//this keyword
//this keyword is refrence type that used
//to reffer current object
class Parent {
	int a,b;
	public Parent() {
	
		//this keyword here invorked parent class
		//constructor with no arguments
		this("sorabh kumar");
		System.out.println("This parent class constructor with no arguments");
	}
	public Parent(String name) {
		System.out.println("This parent class constructor with argument " + name);
	}
	public Parent(int a, int b){
		//this keyword also help us to initialize 
		//class variable
		this.a=a;
		this.b=b;
	}
public void show(){
	
		System.out.println("the value of a and b is "+a+"  "+b);
			}	
}
public class Main {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Parent p2=new Parent(12,86);
		p2.show();
	}
}