package acmPractice;

import java.io.BufferedInputStream;
import java.util.Scanner;

// @JUDGE_ID: 922790
// @PROBLEM ID: 154 Recycling

public class Recycling {
    public static void main(String args[]) // entry point from OS
    {
        SplitNumber myWork = new SplitNumber(); // create a dynamic instance
        myWork.begin(); // the true entry point
    }

    void begin() {
        Scanner in;

        in = new Scanner(new BufferedInputStream(System.in));
        // useful to do this for large input files

        // loop over inputs
        while (in.hasNext()) {
            int num = in.nextInt();
            if (num <= 0) break;


        } // end of while
        in.close();
        System.exit(0);
    }
}
