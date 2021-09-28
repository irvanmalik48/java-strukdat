class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int arr[] = new int[10], index = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}

		arr[3] = arr[5] = arr[7] = 50;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
			if (arr[i] == 50) {
				list.add(i);
				index++;
			}
		}

		System.out.printf("\nJumlah Kemunculan: %d\nIndeks: %s\n", index, list);
		/*
		 * list.add(1.2f); list.add(2.4f); list.add(3.6f); list.add(4.8f);
		 * list.add(6.0f); list.add(7.2f);
		 *
		 * System.out.println(list);
		 *
		 * list.pop();
		 *
		 * System.out.println(list); System.out.println(list.getValue(3));
		 *
		 * list.remove(1);
		 *
		 * System.out.println(list);
		 *
		 * list.push(1.9f); list.push(1.5f);
		 *
		 * System.out.println(list);
		 *
		 * list.setValue(4, 2.0f);
		 *
		 * System.out.println(list); System.out.println(list.size());
		 *
		 * list.remove();
		 *
		 * System.out.println(list); System.out.println(list.size());
		 * System.out.println(list.isEmpty());
		 *
		 * list.clear();
		 *
		 * System.out.println(list); System.out.println(list.size());
		 * System.out.println(list.isEmpty());
		 */
	}
}
