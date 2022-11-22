package ru.netology.domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getNumberOfStation() {
        Radio radio = new Radio(10);

        assertEquals(10,radio.getNumberOfStation());
    }

    @Test
    void setNumberOfStations() {
        Radio radio = new Radio();

        radio.setNumbersOfSatntion(10);

        assertEquals(10,radio.getNumbersOfSatntion());
    }

    @Test
    void setCurrentStantion() {
        Radio radio = new Radio();

        radio.setCurrentStantion(6);

        assertEquals(6,radio.getCurrentStantion());
    }

    @Test
    void setNextStantion() {
        Radio radio = new Radio();

        radio.setCurrentStantion(8);
        radio.setNextStantion();

        assertEquals(9,radio.getCurrentStantion());
    }

    @Test
    void setPrevStantion() {
        Radio radio = new Radio();

        radio.setCurrentStantion(1);
        radio.setPrevStantion();

        assertEquals(0,radio.getCurrentStantion());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        assertEquals(100,radio.getCurrentVolume());
    }

    @Test
    void setNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.setNextVolume();

        assertEquals(100,radio.getCurrentVolume());
    }

    @Test
    void setLowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setLowVolume();

        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void getCurrentStantion() {
        Radio radio = new Radio();

        radio.setCurrentStantion(0);

        assertEquals(0,radio.getCurrentStantion());
    }

    @Test
    void getNumbersOfSatntion() {
        Radio radio = new Radio(10);

        assertEquals(10,radio.getNumberOfStation());
    }

    @Test
    void getMaxStantion() {
        Radio radio = new Radio();

        radio.setMaxStantion(9);

        assertEquals(9,radio.getMaxStantion());
    }

    @Test
    void getMinStantion() {
        Radio radio = new Radio();

        radio.setMinStantion(0);

        assertEquals(0,radio.getMinStantion());
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void getMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(100);

        assertEquals(100,radio.getMaxVolume());
    }

    @Test
    void getMinVolume() {
        Radio radio = new Radio();

        radio.setMinVolume(0);

        assertEquals(0,radio.getMinVolume());
    }

    @Test
    void setNumbersOfSatntion() {
        Radio radio = new Radio();

        radio.setNumbersOfSatntion(10);

        assertEquals(10,radio.getNumbersOfSatntion());
    }

    @Test
    void setMaxStantion() {
        Radio radio = new Radio();

        radio.setMaxStantion(9);

        assertEquals(0,radio.getMaxStantion());
    }

    @Test
    void setMinStantion() {
        Radio radio = new Radio();

        radio.setMinStantion(0);

        assertEquals(0,radio.getMinStantion());
    }

    @Test
    void setMaxVolume() {
        Radio radio = new Radio();

        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(100);

        assertEquals(100,radio.getMaxVolume());
    }

    @Test
    void setMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);

        assertEquals(0,radio.getMinVolume());
    }
}