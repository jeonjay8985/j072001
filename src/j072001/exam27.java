package j072001;

import java.util.Scanner;

public class exam27 {

	public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
		
		System.out.print("몇 개의 *를 표시할까요? : ");
		int n=s1.nextInt();
		
		int i=1;
		do {System.out.print("*");
		     i++;                         
		}while(i<=n);
		
		
		
     //do-while 먼저 수행+나중조건. 무조건 한번은 찍힘

	}

}
