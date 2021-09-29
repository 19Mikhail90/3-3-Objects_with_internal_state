package ru.netotlogy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio rad = new Radio();
    Radio radio20 = new Radio(20);
    @Test
    public void shouldTwentyNumberStation() { // новое радио
        radio20.setNumberStation(15); // выбор 15 ой
        int expected = 15;
        int actual = radio20.getNumberStation();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldSetGreaterTwentyNumberStation() {// новое радио
        radio20.setNumberStation(21); // выбор станции не в диапазоне станций
        int expected = 20;
        int actual = radio20.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для номера станции №1
    public void shouldSetNumberStation() {
        rad.setNumberStation(4);
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для номера станции №2
    public void shouldSetSmallerNumberStation() {
        rad.setNumberStation(-1);
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №3
    public void shouldSetGreaterNumberStation() {
        rad.setNumberStation(10);
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №1
    public void shouldSetCurrentVolume() {
        rad.setСurrentVolume(5);
        int expected = 5;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №2
    public void shouldSetSmallerCurrentVolume() {
        rad.setСurrentVolume(-1);
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №3
    public void shouldSetGreaterCurrentVolume() {
        rad.setСurrentVolume(101);
        int expected = 100;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNumberStation() {
        rad.setNumberStation(5);
        rad.changeNumberStation();
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation() {
        rad.setNumberStation(5);
        rad.increaseNumberStation();
        int expected = 6;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasePenultimateNumberStation() { // тут тестируем предпоследний номер станции
        rad.setNumberStation(8);
        rad.increaseNumberStation();
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxNumberStation() { // тут тестируем последний номер станции
        rad.setNumberStation(9);
        rad.increaseNumberStation();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation() {
        rad.setNumberStation(5);
        rad.decreaseNumberStation();
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasePenultimateNumberStation() { // тут тестируем второй номер станции
        rad.setNumberStation(1);
        rad.decreaseNumberStation();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinNumberStation() {
        rad.setNumberStation(0);
        rad.decreaseNumberStation();
        int expected = 9;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        rad.setСurrentVolume(7);
        rad.increaseCurrentVolume();
        int expected = 8;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasePenultimateCurrentVolume() { // тут тестируем предпоследнее переключение громкости
        rad.setСurrentVolume(99);
        rad.increaseCurrentVolume();
        int expected = 100;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxCurrentVolume() {
        rad.setСurrentVolume(100);
        rad.increaseCurrentVolume();
        int expected = 100;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        rad.setСurrentVolume(4);
        rad.decreaseCurrentVolume();
        int expected = 3;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasePenultimateCurrentVolume() { //тут уменьшаем со второго значения
        rad.setСurrentVolume(1);
        rad.decreaseCurrentVolume();
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinCurrentVolume() {
        rad.setСurrentVolume(0);
        rad.decreaseCurrentVolume();
        int expected = 0;
        int actual = rad.getСurrentVolume();
        assertEquals(expected, actual);
    }
}
