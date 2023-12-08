package j072001;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("점수 : ");
		
        float score=s1.nextFloat();
        
        if(80<score && score<100) {
			System.out.println("수");
			
        }else if (70<score && score<79){
        	System.out.println("우");
        	
        }else if (60<score && score<69){
        	System.out.println("미");
        	
        }else if (50<score && score<59){
        	System.out.println("양");
        	
        }else if (0<=score && score<49){
        	System.out.println("가");
        	
		}else {
            System.out.println("잘못된 점수입니다");
		
		
	    }
	}
}
