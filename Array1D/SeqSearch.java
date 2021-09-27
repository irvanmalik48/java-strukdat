import java.util.Scanner;

class SeqSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 9, 6, 14, 12, 10, 8, 3, 4, 1, 2, 7, 11, 13, 5 };

		int valToSearch = scan.nextInt(), valIndex = -1;

		for (int i = 0; i < arr.length; i++) if (
			valToSearch == arr[i]
		) valIndex = i;

		if (valIndex != -1) System.out.printf(
			"\nSearched value %d found in index %d",
			valToSearch,
			valIndex
		); else System.out.printf("\nSearched value %d not found", valToSearch);
	}
}
