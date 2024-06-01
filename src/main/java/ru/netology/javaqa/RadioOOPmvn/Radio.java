package ru.netology.javaqa.RadioOOPmvn;

public class Radio {
    private int currentStation; // переменная текущей радиостанции
    private int currentVolume; // переменная текущей громкости


    public int getCurrentStation() { // Геттер радиостанции
        return currentStation;
    }

    public int getCurrentVolume() { // Геттер громкости
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) { // настройка радиостанции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { // настройка громкости
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() { // переключение на следующую радиостанцию

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() { // переключение на предыдущую радиостанцию

        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void volumeUp() { // увеличение громкости

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void volumeDown() { // уменьшение громкости

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}

