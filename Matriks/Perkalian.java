import java.util.Scanner;

class Perkalian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row1, row2, col1, col2, sum = 0;
        int mat1[][] = new int[20][20];
        int mat2[][] = new int[20][20];
        int res[][] = new int[20][20];

        System.out.print("Baris matriks pertama: ");
        row1 = scan.nextInt();
        System.out.print("Kolom matriks pertama: ");
        col1 = scan.nextInt();
        System.out.print("Baris matriks kedua: ");
        row2 = scan.nextInt();
        System.out.print("Kolom matriks kedua: ");
        col2 = scan.nextInt();

        if (col1 == row2)
            System.out.println("Kedua matriks dapat dikalikan.");
        else {
            System.out.println("Kedua matriks tak dapat dikalikan.");
            System.exit(0);
        }

        System.out.println("Matriks pertama: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                mat1[i][j] = (int) (Math.random() * 100);
                System.out.printf("%02d ", mat1[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriks kedua: ");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                mat2[i][j] = (int) (Math.random() * 100);
                System.out.printf("%02d ", mat2[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    sum += mat1[i][k] * mat2[k][j];
                }
                res[i][j] = sum;
                sum = 0;
            }
        }

        // hasil
        System.out.println("Hasil: ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("%05d ", res[i][j]);
            }
            System.out.println();
        }
    }
}