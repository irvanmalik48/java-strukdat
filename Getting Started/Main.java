class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}