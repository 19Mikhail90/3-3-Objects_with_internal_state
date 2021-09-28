package ru.netotlogy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
   /* @Test // тест на выбор станции
    public void shouldNumberStation() {
        Radio radio = new Radio(0,0,9,0,0,10);

    }*/

    @Test // тест на выбор станции
    public void shouldSetNumberStation() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getNumberStation());
    }

    @Test
    public void shouldSetterNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(15);
        int expected = 15;
        int actual = radio.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSmallerNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        int expected = rad.getMinNumberStation();
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetGreaterNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(21);
        rad.increaseNumberStation();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test // тест на Сеттер для уровня громкости №1

    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(20);
        int expected = 20;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // уменьшение громкости меньше минимальной
    public void shouldSetSmallerCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        int expected = rad.getMinNumberStation();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test // увеличение громкости больше максимальной
    public void shouldSetGreaterCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        int expected = rad.getMaxCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        rad.changeNumberStation();
        int expected = 5;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(19);
        rad.increaseNumberStation();
        int expected = 20;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxNumberStation() { // тут тестируем последний номер станции
        Radio rad = new Radio();
        rad.setNumberStation(21);
        rad.increaseNumberStation();
        int expected = rad.getMinNumberStation();
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);
        rad.decreaseNumberStation();
        int expected = 4;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasePenultimateNumberStation() { // тут тестируем второй номер станции
        Radio rad = new Radio();
        rad.setNumberStation(1);
        rad.decreaseNumberStation();
        int expected = 0;
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinNumberStation() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.decreaseNumberStation();
        int expected = rad.getMaxNumberStation();
        int actual = rad.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseCurrentVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasePenultimateCurrentVolume() { // тут тестируем предпоследнее переключение громкости
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseCurrentVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseCurrentVolume();
        int expected = rad.getMaxCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(4);
        rad.decreaseCurrentVolume();
        int expected = 3;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasePenultimateCurrentVolume() { //тут уменьшаем со второго значения
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseCurrentVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseCurrentVolume();
        int expected = rad.getMinCurrentVolume();
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
