
public class Q1 {
	int roll_no;
	String name;
	
	Q1(int i,String n){
		roll_no = i;
		name = n;
		
	}
	void print() {
		System.out.println(roll_no+ " "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 student = new Q1(2,"John");
		
		student.print();

	}

}
