package j072001;

import java.util.Scanner;

public class exam24 {

	public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
		
		int mon;
		do {
		System.out.print("올바른 월을 입력하세요[1~12] : ");	
		mon=s1.nextInt();
		
		}
		while(mon<1 || mon>12);
		if(mon<6 && mon>2) {
		System.out.println("봄");
		}else if(mon<9 && mon>5) {
			System.out.println("여름");
		}else if(mon<12 && mon>8) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		

	}

}
