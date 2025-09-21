public class galley {
    public static void main(String[] args) {
        int[] Gary = { 1, 2, 3, 4, 4, 2, 1, 1, 2 };
        int counter = 0;
        int i = 0;
        while (counter < 8) {
            if (i == 8) {
                i = 0;
            } else if (Gary[i] <= Gary[i + 1]) {
                counter = counter + 1;
            } else {
                counter = 0;
                int temp = Gary[i];
                Gary[i] = Gary[i + 1];
                Gary[i + 1] = temp;
            }
            i = i + 1;
        }
        for (i = 0; i < 9; i++) {
            System.out.println(Gary[i]);
        }
    }

}
