import java.util.*;

public class Ex1 {

    static class RowData {
        public int space = 0;
        public int symbol = 0;
    }

    public static void aVFR(RowData thisRow) {
        thisRow.space--;
        thisRow.symbol += 2;
    }

    public static void main(String arg[]) {

        Scanner console = new Scanner(System.in);
        RowData thisRow = new RowData();
        System.out.print("Enter number of spaces");
        thisRow.space = console.nextInt();
        System.out.print("Enter number of symbol");
        thisRow.symbol = console.nextInt();
        aVFR(thisRow);
        System.out.println(thisRow.space);
        System.out.println(thisRow.symbol);

    }
}
