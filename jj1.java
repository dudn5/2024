package jj1;


import java.util.ArrayList;
import java.util.Scanner;


public class jj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in =new Scanner(System.in);
	ArrayList<Integer>scores=new ArrayList();
	int data;
	int sum=0;
	
	while((data=in.nextInt())>=0)
			scores.add(data);
		for(int i=0;1<scores.size(); i++)
			sum+=scores.get(i);
	System.out.println("평균= "+(double)sum/scores.size());
	}

}
