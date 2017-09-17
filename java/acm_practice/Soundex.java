package acm_practice;

// @JUDGE_ID: 922790
// @PROBLEM ID: 10260 Soundex

import java.io.*;
import java.util.*;

public class Soundex {
    public static void main (String args[])  // entry point from OS
    {
        Soundex myWork = new Soundex();  // create a dinamic instance
        myWork.Begin();            // the true entry point
    }

    void Begin() {
        Scanner in;

        in = new Scanner(new BufferedInputStream(System.in));
        // useful to do this for large input files

        // loop over inputs
        while (in.hasNext()) {
            String word = in.next();
            System.out.println(soundex(word));

        } // end of while
        in.close();
        System.exit(0);
    }

    String soundex(String s) {
        String soundex = "";
        char[] keys = {'0', '1', '2', '3', '0', '1', '2', '0', '0', '2', '2', '4', '5', '5', '0', '1', '2', '6', '2', '3', '0', '1', '0', '2', '0', '2'};
        int prevCode = 0;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            int dist = curr - 'A';
            char key = keys[dist];
            if (key != '0' && prevCode != key) {
                soundex += key;
                prevCode = key;
            } else if (key == '0') {
                prevCode = 0;
            }
        }
        return soundex;
    }
}
