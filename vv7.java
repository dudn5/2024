package vv7;

public class vv7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender gender= Gender.FEMALE;
		if(gender== Gender.MALE)
			System.out.println(Gender.MALE+"은 병역 의무가있다.");
		else
			System.out.println(Gender.FEMALE+"은 병역 의무가 없다");
		for(Gender g: gender.values())
			System.out.println(g.name());
		
		System.out.println(gender.valueOf("MALE"));
	}

}

enum Gender{
	MALE("남성"),FEMALE("여성");
	
	private String s;
	
	Gender(String s){
		this.s=s;
	}
	public String toString() {
		return s;
	}
}