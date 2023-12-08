package j072001;

import java.util.Scanner;

public class exam22 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1=s1.nextInt();
		System.out.print("두번째 정수 : ");
		int num2=s1.nextInt();
		System.out.print("세번째 정수 : ");
		int num3=s1.nextInt();
		

		if(num1<num2 && num1<num3) {
			System.out.println("최솟값은 "+num1+" 입니다");
		}else if(num2<num1 && num2<num3) {
			System.out.println("최솟값은 "+num2+" 입니다");
		}else {
			System.out.println("최솟값은 "+num3+" 입니다");
		}

	}

}
