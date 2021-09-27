import java.util.Random;

class Main {

	static void alt() {
		// Math.random() way
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) arr[i] =
			(int) (Math.random() * 100) - 1;

		System.out.println("Math.random() way: ");
		for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
		System.out.println();
	}

	public static void main(String[] args) {
		// Random way
		Random rand = new Random();
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) arr[i] = rand.nextInt(100);

		System.out.println("Random way: ");
		for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
		System.out.println();

		alt();
	}
}
