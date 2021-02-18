import java.util.*;
public class Complex {
	int real;
	int imaginary;
	
	Complex(int r,int i){
		real=r;
		imaginary=i;
	}
	public static Complex add(Complex a, Complex b) {
		return new Complex((a.real+b.real),(a.imaginary+b.imaginary));
	}
	public static Complex difference(Complex a, Complex b) {
		return new Complex((a.real-b.real),(a.imaginary-b.imaginary));
	}
	public static Complex product(Complex a, Complex b) {
		return new Complex(((a.real*b.real)-(a.imaginary*b.imaginary)),((a.real*b.real)+(a.imaginary*b.imaginary)));
	}
	public void printNumber() {
		if(real == 0 && imaginary !=0) {
			System.out.println(imaginary+"i");
		}
		else if(imaginary == 0 && real != 0) {
			System.out.println(real);
		}
		else {
			System.out.println(real+"+"+imaginary+"i");
		}
	}

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
	       
		
	    System.out.println("Enter first number");
		 int real = input.nextInt();
			
		System.out.println("Enter second number");
		int imaginary = input.nextInt();
		Complex first = new Complex(real,imaginary);
		Complex second = new Complex(real,imaginary);
		
		Complex zoo = Complex.add(first,second);
		Complex java = Complex.difference(first,second);
		Complex kill = Complex.product(first,second);
	
		System.out.println("Complex numbers for addition, difference and product are as follows");
		zoo.printNumber();
		java.printNumber();
		kill.printNumber();

	}

}
