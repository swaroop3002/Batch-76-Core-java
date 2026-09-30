package programs_of_exam_Questions;

public class Unary_Op_Demo1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = x++ - --y - x + y - x-- + y--;


		System.out.println("print the x value : " + x);
		System.out.println(" print the y value : " + y);
		System.out.println(" print the z value : " + z);
		
		int x1 = 0;
		int y1 = -1;
		
		int z1 = (x1 + y1) - --x1 + (x1 + y1) - y1-- + x1--;
		
		int x2 = 5;
		int y2 = 4;
		
		int z2 = x2*x2 + (--y2)*(--y2) - (x2--)*(x2--) - y2++ + x2-- + y2--;
		
		int x3 = -2;
		int y3 = -5;
		int X = (x3++ * 2) - (y3 - 2) + ((x3--)-4) + (y3++ * 4);
		
		System.out.println("The values of z : " + z);
		System.out.println("The values of z1 : " + z1);
		System.out.println("The values of z2 : " + z2);
		System.out.println("The values of X : " + X);
		

	}

}
