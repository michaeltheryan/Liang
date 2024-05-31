package chapter1;

public class OnePoint4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-8s%-8s%-8s%n", "a", "a^2", "a^3");
		System.out.printf("%-8d%-10d%-8d%n", (int)Math.pow(1, 1), (int)Math.pow(1, 2), (int)Math.pow(1, 3));
		System.out.printf("%-8d%-10d%-8d%n", (int)Math.pow(2, 1), (int)Math.pow(2, 2), (int)Math.pow(2, 3));
		System.out.printf("%-8d%-10d%-8d%n", (int)Math.pow(3, 1), (int)Math.pow(3, 2), (int)Math.pow(3, 3));
		System.out.printf("%-8d%-9d%-8d%n", (int)Math.pow(4, 1), (int)Math.pow(4, 2), (int)Math.pow(4, 3));
	}
}
