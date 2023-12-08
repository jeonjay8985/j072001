package j072001;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요 : "); 
		int num1=s1.nextInt();
		System.out.println("x값은 "+num1+" 입니다"); 
		
		System.out.print("y값을 입력하세요 : "); 
		int num2=s1.nextInt();
		System.out.println("y값은 "+num2+" 입니다");
		
		System.out.print("z값을 입력하세요 : "); 
		int num3=s1.nextInt();
		System.out.println("z값은 "+num3+" 입니다");
		
		int num4=num1+num2+num3;
		System.out.println("합계는 " +num4+ "입니다");
		int num5=(num1+num2+num3)/3;
		System.out.println("평균은 " +num5+ "입니다");
		
		

	}

}
