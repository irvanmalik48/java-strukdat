class Determinan {
    public static void main(String[] args) {
        int matrix[][] = new int[2][2];
        int det;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        System.out.printf("Determinan: %d", det);
    }
}