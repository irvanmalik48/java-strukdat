class Penambahan {

	public static void main(String[] args) {
		int mat1[][] = new int[5][5];
		int mat2[][] = new int[5][5];
		int res[][] = new int[5][5];

		// mat1
		System.out.println("Matriks 1: ");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				mat1[i][j] = (int) (Math.random() * 100);
				System.out.printf("%02d ", mat1[i][j]);
			}
			System.out.println();
		}

		// mat2
		System.out.println("Matriks 2: ");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				mat2[i][j] = (int) (Math.random() * 100);
				System.out.printf("%02d ", mat2[i][j]);
			}
			System.out.println();
		}

		// Penambahan
		System.out.println("Hasil Penambahan: ");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = mat1[i][j] + mat2[i][j];
				System.out.printf("%03d ", res[i][j]);
			}
			System.out.println();
		}
	}
}
