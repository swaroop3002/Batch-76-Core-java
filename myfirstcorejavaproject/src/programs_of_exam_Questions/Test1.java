package programs_of_exam_Questions;

public class Test1 {
	
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean boo;
	

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		// Primitive DataTypes
		// To store big to small values we use Explicit Type Casting
		
		t1.b = 127; // in byte we can store up to - 128 to 127
		t2.b = (byte) 140; //byte to int conversion
		t1.s = 32767; // in short -32768 to 32767
		t2.s = (short) 32768;
		
//		t1.i = 2147483648; // The literal 2147483648 of type int is out of range 
		t1.i = 2147483647; // In int -2147482648 to 2147482647
		t2.i =  (int)2147483648L; //in int automatically converted into Long
		
		t1.l = 9199759915021546499L; // in 
		
		t1.f= 5.888f;
		
		t1.d = 88.99D;
		t2.d= 889999999999999999999999999999999.77D;
		
//		boolean b1 = true;
		
		System.out.println();

		System.out.println( "byte value : " +t1.b);
		System.out.println( "short value : " +t1.s);
		System.out.println( "int value : " +t1.i);
		System.out.println( "long value : " +t1.l);
		System.out.println( "float value : " +t1.f);
		System.out.println("double value : " +t1.d);
		System.out.println("double value with Syntific notation (E) : " +t2.d);

		
//		System.out.println(t1.c);
//		System.out.println(t1.boo);
	}

}
