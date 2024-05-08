package sec03;

interface portable{
	void inMyBag();
}

public class Notebook extends Computer implements portable {
	public void inmyBag() {
		System.out.pritln("노트북은 가방에 있다.");
	}

	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
