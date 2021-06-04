//Dynamic method dispatched
//dynamic method dispatched is refer to runtime
//polymorphism
class University {
	public void universityDetail() {
		System.out.println("great universitise that are working toward to make education more simple and interesting ");
	}
}
class Harved extends University{
	public void universityDetail() {
		System.out.println("Harverd is great university");

	}

}
public class Main {
	public static void main(String[] args) {
University uh=new Harved();
//this runtime make decision weither run Harved class method or University class method
uh.universityDetail();
	}
}