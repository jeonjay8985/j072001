package j072001;

import java.util.Scanner;

public class exam25 {

	public static void main(String[] args) {
	    Scanner s1=new Scanner(System.in);
		
		System.out.print("몇개의 *를 표시할까요 : ");
		int n=s1.nextInt();
		for(int i=1 ; i<=n; i++){
		
			System.out.print("*");
			}
		//	System.out.println();         //for문 끝났을때(프린트로 *찍고) 넘어가서 줄 바꿔줌


	   }
	
}
