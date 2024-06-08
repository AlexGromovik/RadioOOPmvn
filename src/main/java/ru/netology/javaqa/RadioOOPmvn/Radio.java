package ru.netology.javaqa.RadioOOPmvn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int minStation = 0; // переменная ниаменьшей радоистнации
    private int maxStation= 9; // переменная ниавысшей радиостанции
    private int currentStation = minStation; // переменная текущей радиостанции
    private int minVolume = 0; // переменная минимального уровня громкости
    private int maxVolume = 100; // переменная максимального уровня грмокости
    private int currentVolume = minVolume; // переменная текущего уровня громкости


    public Radio(int minStation, int maxStation, int currentStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
    }



    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    //    public Radio(int minStation, int maxStation, int currentStation, int minVolume, int maxVolume, int currentVolume) {
//        this.minStation = minStation;
//        this.maxStation = maxStation;
//        this.currentStation = currentStation;
//        this.minVolume = minVolume;
//        this.maxVolume = maxVolume;
//        this.currentVolume = currentVolume;
//    }
//
//    public Radio (int size){ // Конструктор с определением диапазона количества радиостанций в радиоприемнике
//        maxStation = minStation + size;
//
//        System.out.println("Всего радиостанций " + maxStation);
//    }

//    public Radio(int minStation, int maxStation, int currentStation){ // Конструктор без указания параметров
//        this.minStation = minStation;
//        this.maxStation = maxStation;
//        this.currentStation = currentStation;
//        System.out.println("Что новый хозяин желает?");
//    }

//    public int getMinStation(){
//        return minStation;
//    }
//
//    public int getMaxStation(){
//        return maxStation;
//    }
//
//    public int getCurrentStation(){
//        return currentStation;
//    }
//
//    public int getMinVolume(){
//        return minVolume;
//    }
//
//    public int getMaxVolume(){
//        return maxVolume;
//    }
//
//    public int getCurrentVolume() { // Геттер громкости
//        return currentVolume;
//    }
//
//    public void setCurrentStation(int newCurrentStation) { // настройка радиостанции
//        if (newCurrentStation < getMinStation()) {
//            return;
//        }
//        if (newCurrentStation > getMaxStation()) {
//            return;
//        }
//        currentStation = newCurrentStation;
//    }
//
//    public void setCurrentVolume(int newCurrentVolume) { // настройка громкости
//        if (newCurrentVolume < getMinVolume()) {
//            return;
//        }
//        if (newCurrentVolume > getMaxVolume()) {
//            return;
//        }
//        currentVolume = newCurrentVolume;
//    }
//
//    public void nextStation() { // переключение на следующую радиостанцию
//
//        if (currentStation < getMaxStation()) {
//            currentStation = currentStation + 1;
//        } else {
//            currentStation = getMinStation();
//        }
//    }
//
//    public void prevStation() { // переключение на предыдущую радиостанцию
//
//        if (currentStation > getMinStation()) {
//            currentStation = currentStation - 1;
//        } else {
//            currentStation = getMaxStation();
//        }
//    }
//
//    public void volumeUp() { // увеличение громкости
//
//        if (currentVolume < getMaxVolume()) {
//            currentVolume = currentVolume + 1;
//        }
//    }
//
//    public void volumeDown() { // уменьшение громкости
//
//        if (currentVolume > getMinVolume()) {
//            currentVolume = currentVolume - 1;
//        }
//    }
}