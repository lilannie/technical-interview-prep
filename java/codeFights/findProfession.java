package codeFights;

import java.util.LinkedList;

/**
 * https://codefights.com/interview-practice/task/FwAR7koSB3uYYsqDp
 *

 Consider a special family of Engineers and Doctors. This family has the following rules:

 Everybody has two children.
 The first child of an Engineer is an Engineer and the second child is a Doctor.
 The first child of a Doctor is a Doctor and the second child is an Engineer.
 All generations of Doctors and Engineers start with an Engineer.
 */
public class findProfession {

    String findProfessionBFS(int level, int pos) {
        // BFS approach
        int curr_level = 0;
        int level_count = 0;

        LinkedList<Character> s = new LinkedList<>();
        s.add('E');

        while(!s.isEmpty()) {
            char curr = s.removeFirst();
            level_count++;

            if (curr_level == level - 1 && level_count == pos) {
                switch(curr) {
                    case 'E': {
                        return "Engineer";
                    }
                    case 'D': {
                        return "Doctor";
                    }
                }
            }


            if (level_count == Math.pow(2, curr_level)) {
                curr_level++;
                level_count = 0;
            }

            switch(curr) {
                case 'E': {
                    s.add('E');
                    s.add('D');
                    break;
                }
                case 'D': {
                    s.add('D');
                    s.add('E');
                    break;
                }
            }
        }

        return "";
    }

    String findProfessionIteratively(int level, int pos) {
        String levelString = "";

        switch(level) {
            case 1: {
                levelString = "E";
                break;
            }
            case 2: {
                levelString = "ED";
                break;
            }
            default: {
                levelString = "EDDE";
                break;
            }
        }

        for (int i = 4; i <= level; i++) {
            levelString = levelString + levelString;
        }

        char returnChar = levelString.charAt(pos - 1);
        switch(returnChar) {
            case 'D':
                return "Doctor";
            case 'E':
                return "Engineer";
        }

        return "";
    }
}
