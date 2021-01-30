package objects;

public class Tamagotchi {
    private int hungriness = 0;
    private int happiness = 0;
    private int thirstiness = 0;
    private int cleanliness = 0;
    private int tiredness = 0;
    private int max = 10;
    //еда
    public void feed() {
        hungriness -= x;
        if(hungriness < 0) {
            hungriness = 0;
        }
    }

    //прогулка
    public void play() {
        happiness += x;
        thirstiness += x;
        tiredness += x;
        if(happiness > max) {
            happiness = max;
        }
        if (thirstiness > max) {
            thirstiness = max;
        }
        if (tiredness > max) {
            tiredness = max;
        }
    }

    //чистота
    public void clean() {
        cleanliness = max;
    }

    //жажда
    public void thirst() {
        thirstiness = max;
        if (thirstiness > max) {
            thirstiness = max;
        }
    }

    //смена настроение персонажа
    public String getMood() {
        if(tiredness == max) {
            return "asleep";
        }else if (tiredness >= 8) {
            return "tired";
        }else if(hungriness >= 6) {
            return "hungry";
        }else if(cleanliness >= 4) {
            return "dirty";
        }else if(happiness <= 7) {
            return "happy";
        }else if(happiness >= 4) {
            return "normal";
        }else {
            return "sad";
        }
    }

    //как меняються данный со временем
    public void passTime() {
        hungriness++;
        cleanliness--;
        if(tiredness == max) {
            tiredness = 0;
        }else{
            tiredness++;
        }
        if(hungriness >= 7) {
            happiness--;
        }
        if(cleanliness < 3) {
            happiness--;
        }
        //сделать проверку на меньше 0 и больше 10
    }
}
