package DescendingOrder.src;

import java.util.ArrayList;
import java.util.Comparator;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        int number = num;
        ArrayList<Integer> stack = new ArrayList<Integer>();

        while (number > 0) {
            stack.add(number % 10);
            number /= 10;
        }

        number = 0;

        stack.sort(Comparator.reverseOrder());

        for (Integer i : stack) {
            number = 10 * number + i;
        }

        return number;
    }
}
