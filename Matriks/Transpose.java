import java.util.Scanner;

class Transpose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mat[][] = new int[20][20];
		int tp[][] = new int[20][20];
		int row = scan.nextInt(), col = scan.nextInt();
		scan.close();

		System.out.println("Original: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = (int) (Math.random() * 100);
				System.out.printf("%02d ", mat[i][j]);
			}
			System.out.println();
		}

		// transpose
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				tp[j][i] = mat[i][j];
			}
		}

		// print
		System.out.println("Transpose: ");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.printf("%02d ", tp[i][j]);
			}
			System.out.println();
		}
	}
}
