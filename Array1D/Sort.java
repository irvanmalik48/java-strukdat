class Sort {

	public static void main(String[] args) {
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) arr[i] =
			(int) (Math.random() * 100);

		System.out.println("Unsorted: ");
		for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);

		System.out.println("\nSorted: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
			System.out.printf("%d ", arr[i]);
		}
	}
}
