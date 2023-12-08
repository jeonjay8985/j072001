package j072001;

import java.util.Scanner;

public class exam31 {

	public static void main(String[] args) {
	    Scanner s1=new Scanner(System.in);
		
		System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
		int n=s1.nextInt();
		int sum=0;
		
		for(int i=1 ; i<=n; i++){
			sum=sum+i;
			}
		System.out.print("1부터 "+n+" 까지의합은 "+sum+" 입니다");
	}

}
