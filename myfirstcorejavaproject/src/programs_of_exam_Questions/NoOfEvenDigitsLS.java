package programs_of_exam_Questions;

import java.util.Scanner;

public class NoOfEvenDigitsLS {

	public static void main(String[] args) {
		System.out.println("count the even numbers : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp=n;
		int r =0;
		//int sum = 0;
		int div=10;
		
		while(div<temp) {
			n=temp;
		while(n >= div/10) {
			r = n % div ;
			n = n / 10 ;
// 			n/=10;
 			
 		if(r%2==0)	{
 			System.out.println(r);
 		}
 		
 				
		}
		div=div*10;
		System.out.println("------------------");
		}
	}

}
