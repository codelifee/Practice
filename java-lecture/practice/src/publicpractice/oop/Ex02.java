package publicpractice.oop;

class Car {
	private String color;
	private String gearType;
	private int door;
	
	Car() {
		this.color = "white";
		this.gearType = "auto";
		this.door = 4;
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void Print() {
		System.out.printf("%s, %s, %d \n", color, gearType, door);
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
			Car c01 = new Car();
			Car c02 = new Car("red", "auto", 4);
			
			c01.Print();
			c02.Print();
	}
}
