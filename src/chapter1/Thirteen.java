package chapter1;

public class Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double a = 3.4;
		final double b = 50.2;
		final double c = 2.1;
		final double d = .55;
		final double e = 44.5;
		final double f = 5.9;

		final double g = a * d - b * c;
		
		System.out.println("x = " + ((e * d - b * f)/g));
		System.out.println("y = " + ((a * f - e * c)/g));
	}

}
