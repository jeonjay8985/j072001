package j072001;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		  Scanner s1 = new Scanner(System.in);
			
			System.out.print("실수a 입력 : "); 
			float num1=s1.nextFloat();
			System.out.print("실수b 입력 : "); 
			float num2=s1.nextFloat();
			
			if(num1>num2) {
			System.out.print("큰 쪽의 값은 "+num1+" 입니다."); 
			}else {
				System.out.print("큰 쪽의 값은 "+num2+" 입니다."); 
			}
		

	}

}
