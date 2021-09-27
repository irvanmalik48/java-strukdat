import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// Buatlah matriks of int berukuran 5x5
		// Isi matriks dengan bilangan random antara 0-99
		// print ke layar dengan layout 2 dimensi
		Scanner scan = new Scanner(System.in);
		int mat[][] = new int[6][7], input = scan.nextInt();
		scan.close();

		for (int i = 0; i < mat.length; i++) for (
			int j = 0;
			j < mat[0].length;
			j++
		) mat[i][j] = (int) (Math.random() * 100);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) System.out.printf(
				"%02d ",
				mat[i][j]
			);
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < mat.length; i++) for (
			int j = 0;
			j < mat[0].length;
			j++
		) mat[i][j] *= input;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) System.out.printf(
				"%02d ",
				mat[i][j]
			);
			System.out.println();
		}
	}
}
