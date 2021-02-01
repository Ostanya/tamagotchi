package objects;

public class Tamagotchi {
    private int hungriness = 0;
    private int happiness = 0;
    private int thirstiness = 0;
    private int cleanliness = 0;
    private int tiredness = 0;
    private int max = 10;
    private int mid = 5;

    //еда
    public void feed() {
        hungriness -= mid;
        if(hungriness < 0) {
            hungriness = 0;
        }
    }

    //прогулка
    public void play() {
        happiness += mid + 1 ;
        thirstiness += mid + 2;
        tiredness += mid -1;
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
        }else if (tiredness >= mid + 3) {
            return "tired";
        }else if(hungriness >= mid +1) {
            return "hungry";
        }else if(cleanliness >= mid -1) {
            return "dirty";
        }else if(happiness <= mid + 2) {
            return "happy";
        }else if(happiness >= mid - 1) {
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
        if(hungriness >= mid + 2) {
            happiness--;
        }
        if(cleanliness < mid - 2) {
            happiness--;
        }
        //сделать проверку на меньше 0 и больше 10
    }
}
