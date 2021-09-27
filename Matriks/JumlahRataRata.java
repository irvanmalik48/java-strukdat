class JumlahRataRata {

	public static void main(String[] args) {
		int n = 5, m = 5, nm = n * m;
		int mat[][] = new int[n][m], sum = 0;
		double avg;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = (int) (Math.random() * 100);
			}
		}
		// jumlah elemen
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				sum += mat[i][j];
			}
		}
		// rata-rata
		avg = (double) sum / (double) nm;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.printf("\nJumlah: %d", sum);
		System.out.printf("\nRata-rata: %.2f", avg);
	}
}
