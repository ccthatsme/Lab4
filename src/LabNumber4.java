import java.util.Scanner;

public class LabNumber4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Enter a whole number: ");
			int x = scan.nextInt();
			System.out.println("Number     Squared     cubed");
			System.out.println("======     =======     =====");
			for (int i = 0; i <= x; i++) {
				System.out.println(i + "           " + square(i) + "           " + cube(i));
			}

			System.out.println("continue? (y/n)");
			cont = scan.next();

		}



		System.out.println("good bye!");

		scan.close();
		}

	public static int square(int x) {
		int square = x * x;
		return square;
	}

	public static int cube(int x) {
		int cube = x * x * x;
		return cube;
	}
}
