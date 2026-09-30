package com.operator_in_java;
//Assignment Opetators
// = += -= *= /= %=

public class Test_AssignMent_Oper_Demo {

	public static void main(String[] args) {
		int result = 5;
		
		result =  (int) (result + 4.5);
		
//		result += 4.5;//result = result + 4.5 which is previous one (9) 
		
		System.out.println("result : " + result); // 9
		
//		result = result - 3.5; //Type mismatch: cannot convert from double to int [NARROWING]
		result -= 3.5;
		
		System.out.println("Result is : " + result); // 5

		result = result *= 4.5;
		 
		System.out.println("Result is : " + result); //22
		
		result /= 2.5;
		System.out.println(" Result is : " + result); // 8
		
		
		result %= 2;
		System.out.println(" Result is : " + result);
		
		
		
//		System.out.println(a=b);

	}

}
