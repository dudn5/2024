package vv2;

public class vv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender gender=Gender.FEMALE;
		if(gender==Gender.MALE)
			System.out.println(Gender.MALE+"는병역 의무가 있다.");
		else
			System.out.println(Gender.FEMALE+"는 병역 의무가 없다.");
	
	}

}


enum Gender {MALE,FEMALE}
enum Direction{EAST,WEST,SOUTH,NORTH}