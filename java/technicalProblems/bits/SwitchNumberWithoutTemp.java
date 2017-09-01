package technicalProblems.bits;

public class SwitchNumberWithoutTemp {
    public static void switchByDifference(int a, int b) {
        a = a - b;
        b = b + a;
        a = b - a;
    }

    public static void switchByXor(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = b ^ a;
    }
}
