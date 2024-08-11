package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        BonusService service = new BonusService();
        int amount = 2000;

        int actual =service.calculateBonus(amount);
        int expected = 10;

        assertEquals(expected, actual);

    }
    @Test
    void calculateBonus1() {
        BonusService service = new BonusService();
        int amount = 100000;

        int actual =service.calculateBonus(amount);
        int expected = 990;

        assertEquals(expected, actual);
    }
    @Test
    void calculateBonus2() {
        BonusService service = new BonusService();
        int amount = 102000;

        int actual =service.calculateBonus(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}