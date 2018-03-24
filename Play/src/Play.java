import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else if (n % 2 == 0 && n > 20) {
			ans = "not weird";

		}
		else if (n % 2 == 0 && n>6 && n < 20) {
			ans = "weird ";

		}
		else if (n % 2 == 0 && n>2 && n < 5) {
			ans = "not weird ";

		}

		System.out.println(ans);
	}

}
