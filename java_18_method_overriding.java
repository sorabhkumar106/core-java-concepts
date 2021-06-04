/*
* method overiding is used to overide the function
of parent class with same signature
*/
class Tata {
	public Tata() {
		System.out.println("Tata is india's oldest bussiness congmerate");
	}
	public void showDetailsTata(){		
	System.out.println("Tata is an indian bussines congmerate  that operate  more then 120+ countrise with more then $100 billion revenue ");
	}
	public void tcs(){
	System.out.println("tata consultancy is an service bassed company");	
	}
}
class Tcs{
public Tcs(){
System.out.println("tata consultancy service is india's largest IT company that is owned by tata group");	
		}
	//method overriding 	
public void tcs(){
	System.out.println("tata consultancy services is world's biggest IT company in terms of market cap not only that tcs is also india's biggest IT company");
		}	
}
public class Main {
	public static void main(String[] args) {
Tata tata=new Tata();
System.out.println();
Tcs tcs1=new Tcs();
System.out.println();
tcs1.tcs();
	}
}