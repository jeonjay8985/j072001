package j072001;

import java.util.Scanner;

public class exam13 {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
		
	   
	
		System.out.print("변수 A : ");
		int num1= s1.nextInt();
		
		System.out.print("변수 B : ");
		int num2= s1.nextInt();
		
		if(num1%num2==0) {              //!= ~가 아니다
			System.out.println("B는 A의 약수입니다.");
		}else {
			System.out.println("B는 A의 약수가 아닙니다.");

		

	}
	}
}
