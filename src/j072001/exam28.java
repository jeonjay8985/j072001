package j072001;

import java.util.Scanner;

public class exam28 {

	public static void main(String[] args) {
	    Scanner s1=new Scanner(System.in);
	       
        int n;
	
		do { System.out.print("세 자리의 정숫값 : ");
		n=s1.nextInt();
		}
		while(!(n>99 && n<1000));
		
		System.out.println("입력한 값은 : "+n+" 입니다");

	}

}
