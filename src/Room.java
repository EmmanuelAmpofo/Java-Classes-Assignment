
public class Room {
	int rnum;
	double area;
	String rtype;
	boolean acMachine;
	
	void setData(int x,double y, String z,boolean ac){
		rnum = x;
		area = y;
		rtype = z;
		acMachine = ac;
	}
	
	void displayData() {
		System.out.println("Room number is " + rnum);
		System.out.println("Room type is " + rtype);
		System.out.println("Room area is " + area);
		String z = (acMachine) ? "yes" : "no";
		System.out.println("AC in room " + z);
	}
	

	public static void main(String[] args) {
		
		Room room13 = new Room();
		
		room13.setData(113, 200.2, "Executive Room", true);
		room13.displayData();

	}

}
