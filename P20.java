package pattern.program;

import java.util.Scanner;

public class P20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row");
		int n = sc.nextInt();

	
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
				if (j < i) {
					System.out.print("* ");
				}
			}
			System.out.println();

		}

	}
}
