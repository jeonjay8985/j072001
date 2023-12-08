package j072001;

import java.util.Scanner;

public class exam08 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("삼각형의 넓이를 구합니다"); 
		
	     System.out.println("밑변 : "); 
	     float num1=s1.nextFloat();
	
	     System.out.print("높이 : "); 
	     float num2=s1.nextFloat();
	
	     float num3=num1*num2/2;
	     System.out.println("넓이는 " +num3+ "입니다");
	    


	}

}
