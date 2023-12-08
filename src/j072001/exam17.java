package j072001;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
       Scanner s1=new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		int num= s1.nextInt();
		
		if(num % 10 ==0 && num!=0) {             
			System.out.println("이 값은 10의 배수입니다.");
		}else {
			System.out.println("이 값은 10의 배수가 아닙니다.");
			
			


	   }
	}
}
