
package languagefundamentals;


public class TestDemoAutoBoxingAutoUnBoxing {
	

	public static void main(String[] args) {

		//AutoBoxing --> converting primitive to  Wrapper Object Data Types
		
		int i1 = 10;
		Integer i2 = Integer.valueOf(i1);
		
		// Auto UnBoxing --> converting Wrapper Objects to Primitive Data Types
		
		Integer i3 = 15;
		int i4 = i3;
		System.out.println(i1);
		
		System.out.println(i3);
		
	}

}



