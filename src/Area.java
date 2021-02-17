import java.util.Scanner;

public class Area {
	int len ;
	int breadth;
	
	Area(){
		
	}
	
	Area(int i, int b){
		len = i;
		breadth = b;
		
	}
	
	public int returnArea() {
		
		int results  = len * breadth;
		return results;
		
	}
	

	public static void main(String[] args) {
       
		Scanner input = new Scanner(System.in);
	       
		
	    System.out.println("Enter the length of rectangle");
		int len = input.nextInt();
			
		System.out.println("Enter the breadth of rectangle");
		int breadth = input.nextInt();
		
		Area ar = new Area();
		((Area) ar).Area(len,breadth);
		int area=ar.returnArea();

	}

}
