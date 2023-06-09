package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int valueA = calculateFunctionValue(a);
        int valueB = calculateFunctionValue(b);

        if (valueA == valueB) {
            return a.compareTo(b);
        } else {
            return Integer.compare(valueA, valueB);
        }

    }

    private int calculateFunctionValue(String s) {
        int x = Integer.parseInt(s);
        return 5 * x * x + 3;
    }
}
