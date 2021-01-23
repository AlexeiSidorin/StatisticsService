package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsMethodTest {
    StatsMethod method = new StatsMethod();
    int[] money = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void sumTotal() {
        int expected = 180;
        int actual = method.sumTotal(money);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void average() {
        int expected = 15;
        int actual = method.average(money);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void searchMax() {
        int expected = 8;
        int actual = method.searchMax(money);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void searchMin() {
        int expected = 9;
        int actual = method.searchMin(money);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void searchUnderAvg() {
        int expected = 5;
        int actual = method.searchUnderAvg(money);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void searchOverAvg() {
        int expected = 5;
        int actual = method.searchOverAvg(money);
        assertEquals(expected, actual);
    }
}