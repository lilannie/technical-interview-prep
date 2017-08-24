package technicalProblems.lists;

import util.Printing;
import java.util.LinkedList;

public class AddTwoNumbersWithLinkedLists {

    public static LinkedList<Integer> add(LinkedList<Integer> list1, LinkedList<Integer> list2, int length1, int length2) {
        if (length1 == 0) return list2;
        if (length2 == 0) return list1;

        LinkedList<Integer> answer = new LinkedList<>();
        int count1 = length1;
        int count2 = length2;
        int remainder = -1;

        while(count1 > 0 && count2 > 0) {
            int sum = list1.get(length1 - count1) + list2.get(length2 - count2);
            if (remainder > 0) sum += remainder;
            remainder = sum - 9;
            if (remainder > 0) sum -= 10;

            answer.push(sum);
            count1--;
            count2--;
        }

        while(count1 > 0) {
            int sum = list1.get(length1 - count1);
            if (remainder > 0) sum += remainder;
            remainder = sum - 9;
            if (remainder > 0) sum -= 10;

            answer.push(sum);
            count1--;
        }

        while(count2 > 0) {
            int sum = list2.get(length2 - count2);
            if (remainder > 0) sum += remainder;
            remainder = sum - 9;
            if (remainder > 0) sum -= 10;

            answer.push(sum);
            count2--;
        }

        return answer;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.push(4);
        list1.push(5);

        list2.push(3);
        list2.push(4);
        list2.push(5);

        LinkedList answer = add(list1, list2, list1.size(), list2.size());
        Printing.printLinkedList(answer);

        list1 = new LinkedList<>();
        list2 = new LinkedList<>();

        list1.push(6);
        list1.push(3);

        list2.push(7);

        answer = add(list1, list2, list1.size(), list2.size());
        Printing.printLinkedList(answer);
    }

}
