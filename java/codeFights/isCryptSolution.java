package codeFights;

import java.util.HashMap;

public class isCryptSolution {

    public static void main(String args[]) {

    }

    boolean isCryptSolution(String[] crypt, char[][] solution) {
        HashMap<Character, Character> key = new HashMap<>();

        for (int i = 0; i < solution.length; i++) {
            key.put(solution[i][0], solution[i][1]);
        }

        int[] decrypted = new int[crypt.length];
        for (int i = 0; i < crypt.length; i++) {
            String decrypt = "";
            boolean leadingZero = false;
            for (int j = 0; j  < crypt[i].length(); j++) {
                char keyInt = key.get(crypt[i].charAt(j));
                if (j == 0 && keyInt == '0') {
                    leadingZero = true;
                }

                decrypt += keyInt;
            }

            if (leadingZero && decrypt.length() > 1)
                return false;

            try {
                System.out.println(decrypt);
                decrypted[i] = Integer.parseInt(decrypt);
            } catch (Exception e) {
                System.out.println("Caught Exception");
                return false;
            }
        }

        return ((decrypted[0] + decrypted[1]) == decrypted[2]);
    }

}
