public class BubbleSort {
    public static void main(String arg[]) {

        int[] My_Array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        // int[] My_Array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int temp = 0;
        int index = My_Array.length;

        for (int i = 0; i < index - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < index - i - 1; j++) {
                if (My_Array[j] > My_Array[j + 1]) {
                    System.out.print("h");
                    temp = My_Array[j];
                    My_Array[j] = My_Array[j + 1];
                    My_Array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        for (int i = 0; i < My_Array.length; i++) {
            System.out.print(My_Array[i] + " ");
        }

    }
}
