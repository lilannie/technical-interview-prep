package acmPractice;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class BoxOfBricks {
    public static void main(String args[]) // entry point from OS
    {
        BoxOfBricks myWork = new BoxOfBricks(); // create a dynamic instance
        myWork.begin(); // the true entry point
    }

    void begin() {
        Scanner in;

        in = new Scanner(new BufferedInputStream(System.in));
        // useful to do this for large input files

        int num = 0;
        int[] arr = null;
        int problemSet = 1;
        // loop over inputs
        while (in.hasNext()) {
            if (num == 0) {
                num = in.nextInt();
                if (num <= 0) break;
                arr = new int[num];
            }
            else {
                for (int i = 0; i < num; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println("Set #"+problemSet);
                System.out.println("The minimum number of moves is "+calculateMinNumOfMoves(arr));
                num = 0;
                problemSet++;
            }
        } // end of while
        in.close();
        System.exit(0);
    }

    int calculateMinNumOfMoves(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int average = sum / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count += arr[i] - average;
            }

        }

        return count;
    }
}
