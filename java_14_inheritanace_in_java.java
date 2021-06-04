class Company{
	String companyName;
	public Company(String companyName){
	System.out.println("This "+ companyName);	
	this.companyName=companyName;
	}
	public void giveFund(String name,int fund){
		System.out.println(fund+" give to "+name+" child company by "+companyName);
	}
}
class ChildCompany extends Company{
	String childName;
public  ChildCompany(String name,String childName){
	super(name);
	this.childName=childName;
	System.out.println("This child company "+childName);
		}
public void  operation(String work){
System.out.println(childName +" is worked in "+work);
}
}
public class Main {
	public static void main(String[] args) {
	ChildCompany ch=new ChildCompany("Faster Corparation","Faster finacial Services");
	System.out.println("\n");
	ch.operation("finace space");
	System.out.println("\n");
	ch.giveFund("Faster finacial Services",2000000);	
	}
}