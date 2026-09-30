package languagefundamentals;

//import java.util.Scanner;

public class EvenOrOdd {
	int number = 41;
	String checkEvenOrOdd() {
		if(number % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}

	public static void main(String[] args) {
		EvenOrOdd e1 = new EvenOrOdd();
		System.out.println("main method started .....");
		System.out.println(e1.checkEvenOrOdd());
	}
}
