public class SuperiorBubbleSort {

    public static void SuperiorBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String arg[]) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        SuperiorBubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
