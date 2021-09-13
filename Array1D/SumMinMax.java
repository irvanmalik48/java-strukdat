import java.util.Scanner;

class SumMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0, min, max;
        
        for (int i = 0; i < arr.length; i++)
        arr[i] = scan.nextInt();

        max = arr[0];
        min = arr[0];
        
        scan.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("\nsum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}