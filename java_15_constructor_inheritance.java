class Animal{
public Animal(){
System.out.println("this Animal class constructor");	
		}		
}
class Dog extends Animal{
public Dog(){
	System.out.println("This dog class constructor");
	}
//constructor overloading
public Dog(String animalName){
System.out.println(animalName+" class constructor invorked");	
}
}
public class Main {
	public static void main(String[] args) {
	Dog dog1=new Dog();
	System.out.println();
	Dog dog2=new Dog("Dog");	
	}
}