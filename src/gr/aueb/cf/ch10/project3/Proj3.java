package gr.aueb.cf.ch10.project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Proj3 {

    private static final String INPUT_FILE = "src/gr/aueb/cf/ch10/project3/text.txt";

    public static void main(String[] args) throws FileNotFoundException {
        int[][] arr = new int[128][2];
        int bound = 0;
        Scanner in = new Scanner(new File(INPUT_FILE));

        while (in.hasNext()) {
            String word = in.next();
            for (int c : word.toCharArray()) {
                boolean found = false;
                for (int i = 0; i <= bound - 1; i++) {
                    if (arr[i][0] == c) {
                        arr[i][1]++;
                        found = true;
                    }
                }
                if (!found) {
                    arr[bound][0] = c;
                    arr[bound][1] = 1;
                    bound++;
                }
            }
        }

        Arrays.sort(arr, (a, b) -> b[1] - a[1]);

        for (int i = 0; i < bound; i++) {
            System.out.printf("%c -> %d\n", arr[i][0], arr[i][1]);
        }

    }
}
