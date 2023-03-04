package pattern.program;

public class P24 {
	public static void main(String[] args) {

		int n = 5;
		int sp = n - 1;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; i <= sp; j++) {
				System.out.print("  ");
			}
			char c = (char) (64 + i);

			for (int j = 1; j <= st; j++) {
				System.out.print(c + " ");
				if (j < i) {
					c--;
				} else {
					c++;
				}
			}
			System.out.println();
			sp--;
			st = st + 2;
		}

	}
}
