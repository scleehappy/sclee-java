package me.sclee.java.datastructures.list;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ListExampleTest {

    @Test
    void testAddItemsToList() {
        ListExample list = new ListExample();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> storedNumbers = list.getStoredNumbers();
        int sum = 0;
        for (Integer number : storedNumbers) {
            sum += number;
        }

        assertThat(sum).isEqualTo(6);
    }


    @Test
    void testListIsImmutable() {
        ListExample list = new ListExample();

        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> storedNumbers = list.getStoredNumbersAsImmutable();

        assertThrows(RuntimeException.class, () -> {
            storedNumbers.add(0, 3);
        });
    }


    @Test
    void testListIsMutable() {
        ListExample list = new ListExample();

        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> storedNumbers = list.getStoredNumbers();
        storedNumbers.add(0, 3);

        assertThat(list.getStoredNumbers().get(0)).isEqualTo(3);
    }
}