package j072001;

import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정숫값 : "); 
		int num1=s1.nextInt();

		
		int num2=num1+10;
		System.out.println("10을 더한 값은 "+num2+ "입니다");
		int num3=num1-10;
		System.out.println("10을 뺀 값은 " +num3+ "입니다");
		

	}

}
