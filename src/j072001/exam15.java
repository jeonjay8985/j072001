package j072001;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("변수a :");
		int num1= s1.nextInt();
		
		System.out.print("변수b :");
		int num2= s1.nextInt();
		
		if(num1>num2) {              //!= ~가 아니다
			System.out.println("a가 크다.");
		}else {
			System.out.println("b가 크다.");


	  }
	}
}
