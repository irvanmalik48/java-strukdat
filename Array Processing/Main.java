import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Buatlah Array of int berukuran 20, isi dgn bil random antara 1-100
        // print isi array ke layar
        ArrayList<Integer> idx = new ArrayList<Integer>();
        int arr[] = new int[20];
        int counter = 0, sum = 0, index = 0;
        boolean found = false;

        while (index < arr.length) {
            arr[index] = (int) ((Math.random() * 100) + 1);
            index++;
        }
        index = 0;

        //arr[2] = 100;
        //arr[6] = 100;
        //arr[13] = 100;
        //arr[17] = 100;

        while (index < arr.length) {
            System.out.printf("%d ", arr[index]);
            index++;
        }
        System.out.println();
        index = 0;

        while (index < arr.length) {
            // Banyak siswa yang mendapat lebih dari 80
            if (arr[index] > 80)
                counter++;
            // Jumlahkan seluruh angka ganjil
            if (arr[index] % 2 == 1)
                sum += arr[index];
            // Mencari apakah ada bilangan 100
            if (arr[index] == 100) {
                idx.add(index);
                found = true;
            }
            index++;
        }
        System.out.printf("Banyak siswa yang mendapat A (> 80): %d\n", counter);
        System.out.printf("Jumlah seluruh angka ganjil: %d\n", sum);
        index = 0;

        // Mencari apakah ada bilangan 100 (start index)

        // for (int i = 0; i < arr.length; i++)
        //    if (arr[i] == 100) {
        //        toggle = true;
        //        idx.add(i);
        //    }

        // Apakah ada bilangan 100? (normal index order)
        if (found == true)
            System.out.printf("Ditemukan %d angka 100\n", idx.size());

        if (found == true)
            System.out.printf("Ditemukan angka 100 pada indeks ke-%d di posisi mendekati awal\n", idx.get(0));

        // Apakah ada bilangan 100? (reversed index order)
        if (found == true)
            System.out.printf("Ditemukan angka 100 pada indeks ke-%d di posisi mendekati akhir\n", idx.get(idx.size() - 1));

        // Apakah ada bilangan 100? (all possible index)
        if (found == true) {
            System.out.print("Ditemukan angka 100 pada indeks ");
            for (int i: idx) {
                System.out.printf("%d ", i);
            }
        }
        else
            System.out.print("Tidak ditemukan angka 100\n");
    }
}