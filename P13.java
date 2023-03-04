package pattern.program;

public class P13 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
			// OR
		
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
