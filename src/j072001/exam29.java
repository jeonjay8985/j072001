package j072001;

import java.util.Scanner;

public class exam29 {

	public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
		
		System.out.print("양의 정숫값 : ");
		int n=s1.nextInt();
		int sum=1;
				
		int i=1;
		do {sum=sum*i;              
		    i++;
		}while(i<=n);
		
		System.out.println("1부터 "+n+"까지의 곱은 : "+sum+" 입니다");
		
	}

}
