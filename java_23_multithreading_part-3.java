class Sorabh extends Thread {
	public Sorabh(String name) {
		super(name);
	}
	public void run() {
		int i = 0;
		while (i < 5) {
			System.out.println("this Sorabh class");
			i++;
		}
	}
}
class Kallu extends Thread {
	public Kallu(String name) {
		super(name);
	}
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
		Sorabh s1 = new Sorabh("Sorabh kumar");
		Kallu k1 = new Kallu("Kallu");
		s1.start();
		k1.start();
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(k1.getId());
		System.out.println(k1.getName());
	}
}