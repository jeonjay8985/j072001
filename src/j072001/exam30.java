package j072001;

import java.util.Scanner;

public class exam30 {

	public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
     
        System.out.println("카운트다운 합니다.");
		System.out.print("양의 정숫값 : ");
		int n=s1.nextInt();
		
		for(int i=0 ; i<=n; i++){
		
			System.out.println(+n-i);
			}

	}

}
