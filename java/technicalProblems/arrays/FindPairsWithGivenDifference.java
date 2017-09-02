package technicalProblems.arrays;

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

public class FindPairsWithGivenDifference {

    public static void getPairsHashMap(int arr[], int k) {
        HashMap<Integer, ArrayList<Integer>> hashmap = new HashMap<>();
        ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();

        for (int element: arr) {
            if (!hashmap.containsKey(element))
                hashmap.put(element, new ArrayList<>());

            int posDiff = element + k;
            if (hashmap.containsKey(posDiff)) {
                pairs.add(new Pair<>(posDiff, element));
            }

            int negDiff = element - k;
            if (hashmap.containsKey(negDiff)) {
                pairs.add(new Pair<>(negDiff, element));
            }
        }

        for (Pair pair: pairs) {
            System.out.print("["+pair.getKey()+", "+pair.getValue()+"] ");
        }
    }

    public static void getPairsSortedArray(int arr[], int k) {
        ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();

        int first = 0;
        int last = 1;

        while (first < arr.length && last < arr.length) {
            if (first != last && arr[last] - arr[first] == k) {
                pairs.add(new Pair<>(arr[last], arr[first]));
                first++;
                last++;
            }
            else if (arr[last] - arr[first] < k)
                last++;
            else
                first++;
        }


        for (Pair pair: pairs) {
            System.out.print("["+pair.getKey()+", "+pair.getValue()+"] ");
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{0, -1, 2, -2, 1};

        getPairsHashMap(input, 1);

        System.out.println();

        input = new int[]{-2, -1, 0, 1, 2};

        getPairsSortedArray(input, 1);
    }
}
