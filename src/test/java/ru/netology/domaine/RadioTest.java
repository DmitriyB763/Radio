package ru.netology.domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNextStantionWithCorrectMeaning(){ // переключение на след . станции с корректным значением
        Radio radio = new Radio();
        radio.setStantion(7);

        radio.setNextStantion();

        int actual = radio.getCurrentStantion();
        int expected = 8;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextStantionWhereMeaningMax(){ // перключение на след. станцию когда текущая станция максимальная
        Radio radio = new Radio();
        radio.setStantion(9);
        radio.setNextStantion();

        int expected = 0;
        int actual = radio.getCurrentStantion();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextStantionWhereMeaningMin(){ // перключение на след. станцию когда текущая станция минимальная
        Radio radio = new Radio();
        radio.setStantion(1);
        radio.setNextStantion();

        int expected = 2;
        int actual = radio.getCurrentStantion();

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetMinStantionWithCorrectMeaning(){ // перключение на пред. станицию с корретным значением
        Radio radio = new Radio();
        radio.setStantion(5);
        radio.setPrevStantion();

        int actual = radio.getCurrentStantion();
        int expected = 4;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetMinStantionWhereMeaningMax(){ //переключение на пред. станцию когда значение максимальное
        Radio radio = new Radio();
        radio.setStantion(9);
        radio.setPrevStantion();

        int actual = radio.getCurrentStantion();
        int expected = 8;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetMinStatntionWhereMeaningMin(){ // переключение на пред. станцию когда значение минимальное
        Radio radio = new Radio();
        radio.setStantion(-1);
        radio.setPrevStantion();

        int actual = radio.getCurrentStantion();
        int expected = 9;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldSetStantion(){ //установка конкретной станции с корректным значением
        Radio radio = new Radio();

        radio.setStantion(0);

        int actual = radio.getCurrentStantion();
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetStantionWhereMeaningMin(){ // установка конкретной стании с мин. недопустимым значением
        Radio radio = new Radio();
        radio.setStantion(-1);

        int actual = radio.getCurrentStantion();
        int expected = 0;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetStantionWhereMeaningMax(){ // установка конкретной станции с макс. недопустимым значением
        Radio radio = new Radio();
        radio.setStantion(10);

        int actual = radio.getCurrentStantion();
        int expected = 0;

        assertEquals(expected,actual);
    }
    //громкость

    @Test
    public void shouldSetCurrentVolume(){  //  установка конкретной громкости с корректным значением
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }
    @Test
    public void shouldSetCurrentVolumeWhereMeaningMin(){ //установка конкретной громкости с мин. недопустимым значением
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetCurrentVolumeWhereMeaningMax(){ //установка конкретной громкости с макс. недопустимым значением
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetNextVolume(){ // увеличение громкости с корректным значением
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.setNextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected,actual);
    }

    /*@Test
    public void shouldSetNextVolumeWhereMeaningMin(){ //увеличение громкости с минимальным недостимым значением
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);


        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }*/
    @Test
    public void shouldNextVolumeWhereMeaningMax(){ //Увеличение громкости с максимальным недопустимым значением
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setNextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldLowVolume(){ // уменьшение громкости с корректным значением
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.setLowVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected,actual);

    }
    @Test
    public void shouldLowVolumeWhereMeaningMin(){ //уменьшение громкости с  мин. недопустимым значением
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.setLowVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldLowVolumeWhereMeaningMax(){  //уменьшение громкости с  макс. недопустимым значением
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.setLowVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);
    }




}