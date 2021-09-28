package ru.netotlogy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int numberStation = 0;
    private int minNumberStation = 0;
    private int maxNumberStation = 20;
    private int currentVolume = 0;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;

    public Radio(int numberStation) { //тут пользователь выбирает нужную станцию
        this.numberStation = numberStation;
    }


    public void changeNumberStation() { // метод для ручного выставления станции
        return; // по условию возможен ввод числе от 0 до 9 - условия раннего выхода не нужны.
    }

    public void increaseNumberStation() { // тут переключаем на след станцию
        if (numberStation < maxNumberStation) {
            numberStation = numberStation + 1;
        } else {
            numberStation = minNumberStation;
        }
    }

    public void increaseCurrentVolume() { // тут увеличиваем громкость
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseNumberStation() { // тут переключаем на предыдущую станцию
        if (numberStation > minNumberStation) {
            numberStation = numberStation - 1;
        } else {
            numberStation = maxNumberStation;
        }
    }


    public void decreaseCurrentVolume() { // тут уменьшаем громкость
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

}
