package j072001;

import java.util.Scanner;

public class exam23 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int num1=s1.nextInt();
		System.out.print("정수 b : ");
		int num2=s1.nextInt();
		
		int max;
		if(num1>num2) {
			max=num1;
			System.out.println("큰 수는 "+max+" 입니다");
		}else if(num1<num2) {
			max=num2;
			System.out.println("큰 수는 "+max+" 입니다");
		}else {
			System.out.println("두 값이 같습니다");
		}

	}

}
