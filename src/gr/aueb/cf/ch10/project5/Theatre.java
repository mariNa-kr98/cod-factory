package gr.aueb.cf.ch10.project5;

public class Theatre {

    static final int ROWS = 30;
    static final int COLUMNS = 12;

    static boolean[][] seats = new boolean[ROWS][COLUMNS];

    public static void book(char column, int row) {
        int correctedColumn = Character.toUpperCase(column) - 'A';
        int correctedRow = row - 1;
        if (correctedRow < 0 || correctedRow > 29) {
            System.out.printf("Row %d does not exist! Row should be between 1 and 30.\n", row);
            return;
        }
        if (correctedColumn < 0 || correctedColumn > 11) {
            System.out.printf("Column %c does not exist! Column should be between A and L.\n", column);
            return;
        }
        if (seats[correctedRow][correctedColumn] == true) {
            System.out.printf("Seat %c%d is already booked!\n", column, row);
        } else {
            seats[correctedRow][correctedColumn] = true;
            System.out.printf("You booked seat %c%d\n", column, row);
        }
    }

    public static void cancel(char column, int row) {
        int correctedColumn = Character.toUpperCase(column) - 'A';
        int correctedRow = row - 1;
        if (correctedRow < 0 || correctedRow > 29) {
            System.out.printf("Row %d does not exist! Row should be between 1 and 30.\n", row);
            return;
        }
        if (correctedColumn < 0 || correctedColumn > 11) {
            System.out.printf("Column %c does not exist! Column should be between A and L.\n", column);
            return;
        }
        if (seats[correctedRow][correctedColumn] == true) {
            seats[correctedRow][correctedColumn] = false;
            System.out.printf("You cancelled seat %c%d\n", column, row);
        } else {
            System.out.printf("Seat %c%d is already free!\n", column, row);
        }
    }

    public static void main(String[] args) {
        book('c', 30);
        book('b', 12);
        book('c', 1);
        book('c', 0);

        cancel('h', 13);
        cancel('c', 1);
    }

}
