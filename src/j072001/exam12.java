package j072001;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.print("정숫값 :");
		int num= s1.nextInt();
		
		if(num>0) {            
			System.out.println("절대값은 "+num+"입니다");
		}else {
			System.out.println("절대값은 "+num*-1+"입니다");

      }

	}

}
