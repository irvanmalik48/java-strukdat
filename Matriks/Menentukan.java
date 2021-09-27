import java.util.Scanner;

class Menentukan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row1, row2, col1, col2;

		System.out.print("Baris matriks pertama: ");
		row1 = scan.nextInt();
		System.out.print("Kolom matriks pertama: ");
		col1 = scan.nextInt();
		System.out.print("Baris matriks kedua: ");
		row2 = scan.nextInt();
		System.out.print("Kolom matriks kedua: ");
		col2 = scan.nextInt();

		scan.close();

		if (col1 == row2) System.out.println(
			"Kedua matriks dapat dikalikan."
		); else System.out.println("Kedua matriks tak dapat dikalikan.");
	}
}
