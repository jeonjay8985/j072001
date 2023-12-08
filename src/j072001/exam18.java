package j072001;

import java.util.Scanner;

public class exam18 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		int num= s1.nextInt();
		
		if(num % 3 ==0) {             
			System.out.println("이 값은 3으로 나누어집니다.");
		}else if(num % 3 ==1 ){
			System.out.println("이 값을 3으로 나눈 나머지가 1입니다.");
		}else if(num % 3 ==2) {
			System.out.println("이 값을 3으로 나눈 나머지가 2입니다.");

	  }
	}
}
