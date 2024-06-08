package ru.netology.javaqa.RadioOOPmvn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void test2(){
        Radio radio = new Radio(0, 9, 0);

        Assertions.assertEquals(0,radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

//    @Test
//    public void shouldWorkNewConstructorCreateByLombok(){
//        Radio radio = new Radio(0,9,0,0,100,0);
//
//        Assertions.assertEquals(0, radio.getMinStation());
//        Assertions.assertEquals(9, radio.getMaxStation());
//        Assertions.assertEquals(0, radio.getCurrentStation());
//        Assertions.assertEquals(0,radio.getMinVolume());
//        Assertions.assertEquals(100, radio.getMaxVolume());
//        Assertions.assertEquals(0,radio.getCurrentVolume());
//    }
//
//    @Test
//    public void workingTest() {
//        Radio radio = new Radio(0, 9, 0);
//    }
//
////    @Test
////    public void shouldAllRadioStations() {
////        Radio radio = new Radio(9);
////
////        Assertions.assertEquals(0, radio.getMinStation());
////        Assertions.assertEquals(9, radio.getMaxStation());
////        Assertions.assertEquals(0, radio.getCurrentStation());
////    }
//
//    @Test
//    public void shouldSetRadioStation() { // включение радиостанции
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(6);
//
//        int expected = 6;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetVolume() { // настройка громкости
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(0);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetBelowMinRadioStation() { // Проверка включения станции ниже минимальной
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetAboveMaxRadioStation() { // проверка включения радиостанции после последней
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(10);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetBelowMinVolume() { // Проверка включения громкости ниже минимальной
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetAboveMaxVolume() { // включение громкости выше максимальной
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(101);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchToNextStation() { // переключение на следующую радиостанцию
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(2);
//        radio.nextStation();
//
//        int expected = 3;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchToPreviousStation() { // переключение на предыдущую радиостанцию
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(5);
//        radio.prevStation();
//
//        int expected = 4;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchToNextStationAboveMax() { // переключение на следующую радиостанцию после последней
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//        radio.nextStation();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchToPreviousStationBelowMin() {  // переключение на предыдущую радиостанцию перед первой
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(0);
//        radio.prevStation();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void increaseVolume() { //Увеличение громкости
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(16);
//        radio.volumeUp();
//
//        int expected = 17;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void decreaseVolume() { //Уменьшение громкости
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(15);
//        radio.volumeDown();
//
//        int expected = 14;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void increaseVolumeAboveMax() { //Увеличение громкости выше максимальной
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(100);
//        radio.volumeUp();
//
//        int expected = 100;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void decreaseVolumeBelowMin() { //Уменьшение громкости ниже минимальной
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(-1);
//        radio.volumeDown();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
}