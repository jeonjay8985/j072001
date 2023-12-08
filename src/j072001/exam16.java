package j072001;

import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정숫값 : ");
		int num= s1.nextInt();
		
		if(num % 5 ==0 && num>0) {             
			System.out.println("이 값은 5로 나누어집니다.");
		}else if(num % 5!=0 && num>0){
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}else if(num<0) {
			System.out.println("음의 정숫값을 입력했습니다.");


			
		}
	}

}