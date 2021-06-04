/*
*Multi-threading is used to run methods concurrently
*In java multi-threading achived by runable interface and Thread class
*/
class Tcs extends Thread{
public void run(){
	int i=0;
while(i<100){
System.out.println("this tcs class\n");
i++;		
			}	
		}	
}
class Tamo extends Thread{	
public void run(){
	int i=1;
while(i<100){
	i++;
System.out.println("this tata motor class\n");	
}
}
}
class Taj extends Thread{
	public void run(){	
	int i=0;
	while(i<100){
System.out.println("this taj class\n");	
i++;
}
	}
}
public class Main {
	public static void main(String[] args) {
		Taj taj=new Taj();
		Tamo tamo=new Tamo();
		Tcs tcs=new Tcs();
		taj.start();
		tcs.start();
		tamo.start();
	}
}