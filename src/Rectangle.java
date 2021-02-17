
public class Rectangle {
	int length;
	int width;
	
	Rectangle(){
		
	}
	
	public int area(int l, int w) {
		length = l;
		width = w;
		int results = length * width;
		return results;
		
	}

	public static void main(String[] args) {
		
		
		Rectangle rect = new Rectangle();
		Rectangle tangle = new Rectangle();
		
		System.out.println("Area of rectangle with sides 4,5 is = "+rect.area(4,5));
		System.out.println("Area of rectangle with sides 5,8 is = "+tangle.area(8,5));

	}

}
