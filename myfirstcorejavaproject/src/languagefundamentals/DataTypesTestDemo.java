package languagefundamentals;

public class DataTypesTestDemo {
	
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean boo;
	

	public static void main(String[] args) {
		DataTypesTestDemo t1 = new DataTypesTestDemo();

		System.out.println("main method started");
		
		
		System.out.println(t1.b);
		System.out.println(t1.s);
		System.out.println(t1.i);
		System.out.println(t1.l);
		System.out.println(t1.f);
		System.out.println(t1.d);
		System.out.println(t1.c);
		System.out.println(t1.boo);
		
//		t1.b = 127;
//		t1.s = 300;
//		System.out.println(t1.b);
//		System.out.println(t1.s);
		
		System.out.println("main method ended");
	}

}
