package projectUpload;

import java.util.Scanner;

public class sumUntil {
	
	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int sum=0;
		for (int i=0;i<=10;i++) {
			int a=sc.nextInt();
			
			if(a>=0) {
				sum=sum+a;
			
			}else {
				break;
			}
		}
		System.out.print(sum);
		
	}
}