/*
*interface is used to achive multiple inheritance
*/
//interface
interface Bbk{
void oneplus();
void oppo();
void vivo();	
}
class SmartPhone implements Bbk{
public void vivo(){
System.out.println("Vivo smartphone camera and music ");	
		}
public void oppo(){
System.out.println("Opop camera phon");	
		
			}	
public void oneplus(){
System.out.println("oneplus premium smartohones");	
}
}
public class Main {
	public static void main(String[] args) {
	SmartPhone sp=new SmartPhone();
	sp.vivo();
	sp.oppo();
	sp.oneplus();	
	}
}