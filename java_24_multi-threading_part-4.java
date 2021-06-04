class Sorabh implements Runnable {

	public void run() {
		int i = 0;
		while (i < 5) {
			System.out.println("this Sorabh class");
			i++;
		}
	}
}
class Kallu implements Runnable {

	public void run() {
		int i = 0;
		while (i < 5) {
			System.out.println("this Kallu class");
			i++;
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Sorabh s1 = new Sorabh();
		Kallu k1 = new Kallu();
		Thread t1 = new Thread(s1, "Sorabh kumar");
		Thread t2 = new Thread(k1, "Sorabh kumar");
		t1.start();
		t2.start();
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t2.getId());
//		System.out.println(t2.getName());
	}
}