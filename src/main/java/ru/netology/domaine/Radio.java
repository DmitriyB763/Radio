package ru.netology.domaine;

public class Radio {
    private int currentStantion;
    private int numbersOfSatntion = 10;
    private int maxStantion = numbersOfSatntion -1;
    private int minStantion = 0;



    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;



    public Radio() {
    }

    public Radio(int numbersOfSatntion) {
        this.numbersOfSatntion = numbersOfSatntion;
    }
    public Radio(int currentVolume, int maxVolume, int minVolume) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }


    //Количество станций
    public int getNumberOfStation() {
        return numbersOfSatntion;
    }

    public void setNumberOfStations(int numbersOfStation) {
        this.numbersOfSatntion = numbersOfStation;
    }
//Установка станций
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
        if (minVolume > currentVolume) {
            return;
        }
        if (maxVolume < currentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() { //получить максимальную громкость
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
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;

    }

    public void setLowVolume() {   //уменьшение гроскости
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;

    }
}

