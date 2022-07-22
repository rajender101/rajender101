import java.util.Scanner;

public class Area_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//area of circle
	
				area(5);
				//area of rectangle
				area(5,4);
				//area of cylinder
				area(5.4,2);
				//area of square
				area(5.2);
				//area of triangle
				area();

	}
	//global variables
		static Scanner sc = new Scanner(System.in);
		static double pi = 3.14;
		static double area;
		static double base, height;
		// area of circle
		public static void area(int radius) {
			System.out.println("hello");
			
			area = pi*(radius*radius);
			System.out.println("area of circle is "+area);
		}
		// area of rectangle
		public static void area(int length, int breadth) {
			
			area = length* breadth;
			System.out.println("area of rectangle is "+area);
		}
		// area of cylinder
		public static void area(double radius, double height) {
			
			area = ((2*pi)*radius)*(radius+height);
			System.out.println("area of cylinder is "+ area);
		}
		//area of square
		public static void area(double length) {
			area = length*length;
			System.out.println("area of square is"+ area);
		}
		//area of triangle
		public static void area() {
			System.out.println("enter the base and heigth of a triangle");
			base = sc.nextDouble();
			height = sc.nextDouble();
			area = 0.5*(base*height);
			System.out.println("area of triangle is "+area);
		}

}
