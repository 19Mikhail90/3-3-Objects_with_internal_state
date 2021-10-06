package ru.netotlogy;


import lombok.Data;
import lombok.NoArgsConstructor;

/*@AllArgsConstructor*/
@Data
@NoArgsConstructor
public class Radio {

    private int numberStation = 0;
    private int minNumberStation = 0;
    private int totalNumberOfStations = 10;
    private int maxNumberStation = totalNumberOfStations - 1;
    private int currentVolume = 0;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;

    public Radio(int totalNumberOfStations) { // и инт на максимум был в круглых скобках, я убрал
        this.totalNumberOfStations = totalNumberOfStations;
        this.maxNumberStation = totalNumberOfStations - 1; // вот это строчка сгенерировалась в конструкторе как обычный инт без логики
    }

    public void setNumberStation(int newNumberStation) { // метод по созданию радио с определённым количеством станций
        if (newNumberStation < minNumberStation) {
            return;
        }
        if (newNumberStation > maxNumberStation) {
            numberStation = maxNumberStation;
        } else {
            numberStation = newNumberStation;
        }
    }

    public void setСurrentVolume(int newСurrentVolume) { // тут задаем значение станции
        if (newСurrentVolume < minCurrentVolume) {
            return;
        }
        if (newСurrentVolume > maxCurrentVolume) {
            currentVolume = maxCurrentVolume;
        } else {
            currentVolume = newСurrentVolume;
        }

    }

    public void increaseNumberStation() { // тут переключаем на след станцию

        if (numberStation < maxNumberStation) {
            numberStation = numberStation + 1;
        } else {
            numberStation = minNumberStation;
        }
    }

    public void decreaseNumberStation() { // тут переключаем на предыдущую станцию
        if (numberStation > minNumberStation) {
            numberStation = numberStation - 1;
        } else {
            numberStation = maxNumberStation;
        }
    }

    public void increaseCurrentVolume() { // тут увеличиваем громкость
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseCurrentVolume() { // тут уменьшаем громкость
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

}
