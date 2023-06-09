package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for(Integer item: sourceList){
            if(item % 2 == 0){
                result.addLast(item);
            }else {
                result.addFirst(item);
            }
        }
        return result;
    }
}
