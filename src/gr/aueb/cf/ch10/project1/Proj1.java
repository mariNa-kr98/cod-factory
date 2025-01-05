package gr.aueb.cf.ch10.project1;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Proj1 {

    private static final String INPUT_FILE_PATH = "src/gr/aueb/cf/ch10/project1/numbers.txt";
    private static final String OUTPUT_FILE_PATH = "src/gr/aueb/cf/ch10/project1/output.txt";


    public static void main(String[] args) {
        // Read Integers from file
        try {
            Scanner in = new Scanner(new File(INPUT_FILE_PATH));
            int[] inputNumbers = new int[49];
            int numberCount = 0;

            while (in.hasNextInt() && numberCount <= 48) {
                inputNumbers[numberCount++] = in.nextInt();
            }

            int[] numbers = Arrays.copyOfRange(inputNumbers, 0, numberCount);

            // Sort numbers
            Arrays.sort(numbers);

            PrintStream ps = new PrintStream(OUTPUT_FILE_PATH);
            // Produce Combinations
            for (int i = 0; i <= numbers.length - 6; i++) {
                for (int j = i + 1; j <= numbers.length - 5; j++) {
                    for (int k = j + 1; k <= numbers.length - 4; k++) {
                        for (int l = k + 1; l <= numbers.length - 3; l++) {
                            for (int m = l + 1; m <= numbers.length - 2; m++) {
                                for (int n = m + 1; n <= numbers.length - 1; n++) {
                                    int[] combo = {numbers[i], numbers[j], numbers[k], numbers[l], numbers[m], numbers[n]};
                                    // Filter
                                    if (atMostFourEven(combo) && atMostFourOdds(combo) && atMostTwoConsecutive(combo)
                                            && atMostThreeSameEnding(combo) && atMostThreeSameTen(combo)) {
                                        System.out.println(Arrays.toString(combo));
                                        ps.printf("%d %d %d %d %d %d\n", combo[0], combo[1], combo[2], combo[3], combo[4], combo[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean atMostFourEven(int[] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        if (count <= 4) {
            return true;
        }
        return false;
    }

    public static boolean atMostFourOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        if (count <= 4) {
            return true;
        }
        return false;
    }

    public static boolean atMostTwoConsecutive(int[] arr) {
        for (int i = 0; i <= arr.length - 3; i++) {
            if (arr[i] + 1 == arr[i + 1]
                    && arr[i + 1] + 1 == arr[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean atMostThreeSameEnding(int[] arr) {
        int[] endings = new int[10];
        for (int i = 0; i <= arr.length - 1; i++) {
            int digit = arr[i] % 10;
            endings[digit]++;
        }
        for (int count : endings) {
            if (count > 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean atMostThreeSameTen(int[] arr) {
        int[] tens = new int[10];
        for (int i = 0; i <= arr.length - 1; i++) {
            int digit = arr[i] / 10;
            tens[digit]++;
        }
        for (int count : tens) {
            if (count > 3) {
                return false;
            }
        }
        return true;
    }
}
