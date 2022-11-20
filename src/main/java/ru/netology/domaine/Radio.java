package ru.netology.domaine;

public class Radio {
    private int currentStantion;
    private int maxStantion = 9;
    private int minStantion = 0;
    private int numbersOfSatntion = 10;


    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }

    public Radio(int numbersOfSatntion) {
        this.numbersOfSatntion = numbersOfSatntion;
    }

    public int getCurrentStantion() {  // получить текщую станцию
        return currentStantion;
    }

    public void setCurrentStantion(int currentStantion) {  // установить текщую станцию
        if (currentStantion > maxStantion) {
            return;
        }
        if (currentStantion < minStantion) {
            return;
        }
        this.currentStantion = currentStantion;
    }

    public int getMaxStantion() {  //получить максимальную станцию
        return maxStantion;
    }

    public void setMaxStantion(int maxStantion) { //установить максимальную станцию
        this.maxStantion = maxStantion;
    }

    public int getMinStantion() {  // получить минимальную станцию
        return minStantion;
    }

    public void setMinStantion(int minStantion) { // установить мин. станцию
        this.minStantion = minStantion;
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


    //громкость
    public int getCurrentVolume() { // получить текущую громкость
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { // установить текущую громкость
        if (100 < currentVolume) {
            return;
        }
        if (0 > currentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() { //получт максимальную громкость
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) { // установить максимальную громкость
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() { // получить минимальную  громкость
        return minVolume;
    }

    public void setMinVolume(int minVolume) { // установить минимальную  громкость
        this.minVolume = minVolume;
    }

    public void setNextVolume() {   //увеличение громкости
        if (currentVolume < maxVolume) {
            this.currentVolume++;
        }
        return;

    }

    public void setLowVolume() {   //уменьшение гроскости
        if (currentVolume > minVolume) {
            this.currentVolume--;
        }

    }
}

    /* public int getCurrentStantion() {  //текущая станция
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

    }*/


