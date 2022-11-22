package ru.netology.domaine;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Radio {
    private int currentStantion;
    private int numbersOfSatntion = 10;
    private int maxStantion = numbersOfSatntion - 1;
    private int minStantion = 0;


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int numbersOfSatntion) {
        this.numbersOfSatntion = numbersOfSatntion;
    }



    //Количество станций
    public int getNumberOfStation() {
        return numbersOfSatntion;
    }

    public void setNumberOfStations(int numbersOfSatntion ) {
        this.numbersOfSatntion = numbersOfSatntion;
    }

    //Станции
    public void setCurrentStantion(int currentStantion) {  // установить текщую станцию
        if (currentStantion > maxStantion) {
            return;
        }
        if (currentStantion < minStantion) {
            return;
        }
        this.currentStantion = currentStantion;
    }
    public void setNextStantion() {  //следующая станция
        if (currentStantion < maxStantion) {
            currentStantion++;
        } else {
            currentStantion = minStantion;
        }
    }

    public void setPrevStantion() {   //предыдущая станция
        if (currentStantion == minStantion) {
            currentStantion = maxStantion;
        } else {
            currentStantion--;
        }
    }

        //Громкость
        public void setCurrentVolume(int currentVolume) { // установить текущую громкость
            if (minVolume > currentVolume) {
                return;
            }
            if (maxVolume < currentVolume) {
                return;
            }
            this.currentVolume = currentVolume;
        }

        public void setNextVolume () {   //увеличение громкости
            if (currentVolume == maxVolume) {
                return;
            }
            this.currentVolume++;

        }

        public void setLowVolume () {   //уменьшение гроскости
            if (currentVolume == minVolume) {
                return;
            }
            this.currentVolume--;

        }

    }



