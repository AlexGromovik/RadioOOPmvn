package ru.netology.javaqa.RadioOOPmvn;

public class Radio {
    private int minStation = 0; // переменная ниаменьшей радоистнации
    private int maxStation= 9; // переменная ниавысшей радиостанции
    private int currentStation = minStation; // переменная текущей радиостанции
    private int minVolume = 0; // переменная минимального уровня громкости
    private int maxVolume = 100; // переменная максимального уровня грмокости
    private int currentVolume = minVolume; // переменная текущего уровня громкости

    public Radio (){ // Конструктор без указания параметров
        System.out.println("Что новый хозяин желает ");
    }

    public Radio (int size){ // Конструктор с определением диапазона количества радиостанций в радиоприемнике
        maxStation = minStation + size;

        System.out.println("Всего радиостанций " + maxStation);
    }

    public int getMinStation(){
        return minStation;
    }

    public int getMaxStation(){
        return maxStation;
    }

    public int getCurrentStation(){
        return currentStation;
    }

    public int getMinVolume(){
        return minVolume;
    }

    public int getMaxVolume(){
        return maxVolume;
    }

    public int getCurrentVolume() { // Геттер громкости
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) { // настройка радиостанции
        if (newCurrentStation < getMinStation()) {
            return;
        }
        if (newCurrentStation > getMaxStation()) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { // настройка громкости
        if (newCurrentVolume < getMinVolume()) {
            return;
        }
        if (newCurrentVolume > getMaxVolume()) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() { // переключение на следующую радиостанцию

        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
        } else {
            currentStation = getMinStation();
        }
    }

    public void prevStation() { // переключение на предыдущую радиостанцию

        if (currentStation > getMinStation()) {
            currentStation = currentStation - 1;
        } else {
            currentStation = getMaxStation();
        }
    }

    public void volumeUp() { // увеличение громкости

        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() { // уменьшение громкости

        if (currentVolume > getMinVolume()) {
            currentVolume = currentVolume - 1;
        }
    }
}