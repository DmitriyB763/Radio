package ru.netology.domaine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void shouldSetMaxStantion(){   //проверка что максимальная станция 9

        radio.setMaxStantion(9);

        assertEquals(9,radio.getMaxStantion());
    }
    @Test
    public  void shouldSetMinStantion(){
        radio.setMinStantion(0);

        assertEquals(0,radio.getMinStantion());
    }



    @Test
    public void shouldSetNextStantionWithCorrectMeaning(){ // переключение на след . станции с корректным значением

        radio.setCurrentStantion(7);

        radio.setNextStantion();

        int actual = radio.getCurrentStantion();
        int expected = 8;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextStantionWhereMeaningMax(){ // перключение на след. станцию когда текущая станция максимальная

        radio.setCurrentStantion(9);
        radio.setNextStantion();

        int expected = 0;
        int actual = radio.getCurrentStantion();

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetNextStantionWhereMeaningMin(){ // перключение на след. станцию когда текущая станция минимальная

        radio.setCurrentStantion(1);
        radio.setNextStantion();

        int expected = 2;
        int actual = radio.getCurrentStantion();

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetMinStantionWithCorrectMeaning(){ // перключение на пред. станицию с корретным значением

        radio.setCurrentStantion(5);
        radio.setPrevStantion();

        int actual = radio.getCurrentStantion();
        int expected = 4;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetMinStantionWhereMeaningMax(){ //переключение на пред. станцию когда значение максимальное

        radio.setCurrentStantion(9);
        radio.setPrevStantion();

        int actual = radio.getCurrentStantion();
        int expected = 8;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetMinStatntionWhereMeaningMin(){ // переключение на пред. станцию когда значение минимальное

        radio.setCurrentStantion(-1);
        radio.setPrevStantion();

        int actual = radio.getCurrentStantion();
        int expected = 9;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldSetStantion(){ //установка конкретной станции с корректным значением


        radio.setCurrentStantion(0);

        int actual = radio.getCurrentStantion();
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetStantionWhereMeaningMin(){ // установка конкретной стании с мин. недопустимым значением

        radio.setCurrentStantion(-1);

        int actual = radio.getCurrentStantion();
        int expected = 0;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetStantionWhereMeaningMax(){ // установка конкретной станции с макс. недопустимым значением

        radio.setCurrentStantion(10);

        int actual = radio.getCurrentStantion();
        int expected = 0;

        assertEquals(expected,actual);
    }
    //громкость

    @Test
    public void shouldSetCurrentVolume(){  //  установка конкретной громкости с корректным значением

        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }
    @Test
    public void shouldSetCurrentVolumeWhereMeaningMin(){ //установка конкретной громкости с мин. недопустимым значением

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetCurrentVolumeWhereMeaningMax(){ //установка конкретной громкости с макс. недопустимым значением

        radio.setCurrentVolume(101);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);

    }

    @Test
    public void shouldSetNextVolume(){ // увеличение громкости с корректным значением

        radio.setCurrentVolume(99);

        radio.setNextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

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

        radio.setCurrentVolume(100);
        radio.setNextVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldLowVolume(){ // уменьшение громкости с корректным значением


        radio.setCurrentVolume(10);
        radio.setLowVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected,actual);

    }
    /*@Test
    public void shouldLowVolumeWhereMeaningMin(){ //уменьшение громкости с  мин. недопустимым значением


        radio.setCurrentVolume(-1);
        radio.setLowVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);
    }*/

    @Test
    public void shouldLowVolumeWhereMeaningMax(){  //уменьшение громкости с  макс. недопустимым значением

        radio.setCurrentVolume(101);
        radio.setLowVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldSetMaxVolume(){

        radio.setMaxVolume(100);

        assertEquals(100,radio.getMaxVolume());
    }
    @Test
    public void shouldSetMinVolume(){
        radio.setMinVolume(0);

        assertEquals(0,radio.getMinVolume());
    }




}