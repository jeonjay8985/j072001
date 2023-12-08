package j072001;

import java.util.Scanner;

public class exam07 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
	     System.out.print("x값을 입력하세요 : "); 
	     float num1=s1.nextFloat();
	     System.out.println("x값은 "+num1+" 입니다"); 
	
	     System.out.print("y값을 입력하세요 : "); 
	     float num2=s1.nextFloat();
	     System.out.println("y값은 "+num2+" 입니다");
	
	     float num3=num1+num2;
	     System.out.println("합계는 " +num3+ "입니다");
	     float num4=(num1+num2)/2;
		 System.out.println("평균은 " +num4+" 입니다");

	}

}
