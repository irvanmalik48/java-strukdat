import java.util.Scanner;

class BinSearch {
    static int search(int arr[], int left, int right, int valToSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == valToSearch)
                return mid;
            if (arr[mid] > valToSearch)
                return search(arr, left, mid - 1, valToSearch);
            return search(arr, mid + 1, right, valToSearch);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = {
            9, 6, 14, 12, 10, 8, 3,
            4, 1, 2, 7, 11, 13, 5,
            15, 17, 19, 18, 20, 22,
            21, 24, 23, 26, 25, 29,
            30, 28, 27
        };

        // sort the array first
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }

        int valToSearch = scan.nextInt();
        int valIndex = search(arr, 0, arr.length - 1, valToSearch);

        if (valIndex != -1)
            System.out.printf("\nSearched value %d found in index %d", valToSearch, valIndex);
        else
            System.out.printf("\nSearched value %d not found", valToSearch);
    }
}