package technicalProblems.recursion;

public class printPatternWoLoop {

    static void printPattern(int n, int curr, boolean secondRound) {
        System.out.print(curr+" ");
        if (secondRound && n == curr) {
            return;
        }

        if (curr <= 0)
            secondRound = true;

        if (secondRound) {
            printPattern(n, curr + 5, secondRound);
        }
        else {
            printPattern(n, curr - 5, secondRound);
        }
    }

    public static void main(String[] args) {
        printPattern(16,16, false);
        System.out.println();
        printPattern(10,10, false);

    }

}
