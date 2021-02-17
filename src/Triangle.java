
public class Triangle {
	int base;
	int height;
	int side;
	
	Triangle(){
		base=3;
		height=4;
		side=5;
		
	}
	void calculate() {
		int area = base*height/2;
		int perimeter = base + height + side;
		
		System.out.println("Area of Triangle = " + area);
		System.out.println("Perimeter of Triangle = " + perimeter);
	}

	public static void main(String[] args) {
		Triangle calcu = new Triangle();
		
		calcu.calculate();

	}

}
