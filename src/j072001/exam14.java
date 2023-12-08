package j072001;

import java.util.Scanner;

public class exam14 {

		public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			
			System.out.print("정숫값 :");
			int num= s1.nextInt();

			
			if(num>0) {            
				System.out.println("값이 양수입니다");
			}else if(num<0) {
				System.out.println("값이 음수입니다.");
			}else {
				System.out.println("값이 0입니다.");
	}

}
}