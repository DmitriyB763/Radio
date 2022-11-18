package ru.netology.domaine;

public class Radio {
    int currentStantion;
    private int currentVolume;
/*можно улучшить присвоив значение станций и громкости (мин и макс ) геттерам и сеттарам

    public int getMaxVolume() {   // получить максимальную станцию
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume) {  // установка макс. допустимой станции
        this.maxVolume = 10;
    }*/



    public int getCurrentStantion() {  //текущая станция
        return currentStantion;
    }

    public void setNextStantion() {  //следующая станция
        if (currentStantion < 9) {
            currentStantion++;
        } else {
            currentStantion = 0;
        }
    }

    public void setPrevStantion() {   //предыдущая станция
        if (currentStantion == 0) {
            currentStantion = 9;
        } else {
            currentStantion--;
        }
    }

    public void setStantion(int currentStantion) {      //установка конуретной станции из допустимых
        if (currentStantion > 9) {
            return;
        }
        if (currentStantion < 0) {
            return;
        }

        this.currentStantion = currentStantion;

    }

    //громкость звука


    public void setCurrentVolume(int currentVolume) {  //установить громкость
        if (10 < currentVolume) {
            return;
        }
        if (0 > currentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {  //текущая громкость
        return currentVolume;
    }

    public void setNextVolume() {   //увеличение громкости
        if (currentVolume < 10) {
            this.currentVolume++;
        }
        return;

    }

    public void setLowVolume() {   //уменьшение гроскости
        if (currentVolume > 0) {
            this.currentVolume--;
        }

    }

}
