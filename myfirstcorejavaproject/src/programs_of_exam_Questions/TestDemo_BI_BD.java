package programs_of_exam_Questions;
import java.math.BigInteger;
import java.math.BigDecimal;

public class TestDemo_BI_BD {

	public static void main(String[] args) {
		
//		One method
		BigInteger bi = new BigInteger("234543");
		
		BigInteger bi2 = new BigInteger("5");

		System.out.println(bi.add(bi2));
		System.out.println(bi.multiply(bi2));
//		System.out.println(bi.subtract(bi2)); not availavle in BigInteger
		System.out.println(bi.bitCount());
		System.out.println(bi.divide(bi2));
		
		BigDecimal bd = new BigDecimal("6754.87");
		BigDecimal bd2 = new BigDecimal("4.87");
		
		System.out.println(" ");
		System.out.println(bd.add(bd2));
//      another method
//		System.out.println(bi.(new BigInteger("2345678909876543"))); for BigInteger
//		System.out.println(bd2.(new BigDecimal("3156155.2546"))); for BigDecimal
	}

}
