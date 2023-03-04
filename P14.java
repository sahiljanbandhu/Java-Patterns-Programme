package pattern.program;

public class P14 {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) { // For Spaces 
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("1 ");
				if (j < i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}
}
/*
        1 
      1 * 1 
    1 * 1 * 1 
  1 * 1 * 1 * 1 
1 * 1 * 1 * 1 * 1  
*/
