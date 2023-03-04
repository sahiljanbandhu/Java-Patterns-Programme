package pattern.program;

import java.util.Scanner;

public class P19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int n = sc.nextInt();

		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("1 ");
				if (j < i) {
					System.out.print("* ");
				}
			}
			System.out.println();
			sp--;
		}

	}
}
