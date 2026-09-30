package programs_of_exam_Questions;

public class CountOfObjects {
	
	static int coutn = 0;
	
	CountOfObjects(){
		coutn++;
	}
	
	  
	
	

	public static void main(String[] args) {

		CountOfObjects o1 = new CountOfObjects();
		
		CountOfObjects o2 = new CountOfObjects();
		
		CountOfObjects o3= new CountOfObjects();
		
		CountOfObjects o4 = new CountOfObjects();
		
		System.out.println("Number of Objects : " + coutn);
		
		
	}

}
