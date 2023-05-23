package me.sclee.java.datastructures.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    private final List<Integer> storedNumbers = new ArrayList<>();

    public void add(Integer number) {
        storedNumbers.add(number);
    }

    public List<Integer> getStoredNumbersAsImmutable() {
        return Collections.unmodifiableList(storedNumbers);
    }

    public List<Integer> getStoredNumbersAsCopy() {
        return new ArrayList<>(storedNumbers);
    }

    public List<Integer> getStoredNumbers() {
        return storedNumbers;
    }
}
