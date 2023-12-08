package j072001;

import java.util.Scanner;

public class exam21 {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
		
		System.out.print("변수a :");
		int num1= s1.nextInt();
		
		System.out.print("변수b :");
		int num2= s1.nextInt();
		
		int num3=num1-num2;

		if(num1-num2>0) {           
			System.out.println("두 값의 차는 "+num3+" 입니다");
		}else {
			System.out.println("두 값의 차는 "+num3*-1+" 입니다");

	   }
	}
}
