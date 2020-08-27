package Objects;



public class MyDate {
    int year;
    String month;
    int day;

   public MyDate(String month, int day, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

   public MyDate(int day, int year) {
        this.year = year;
        this.day = day;
    }

    public MyDate(int year) {
        this.year = year;
    }


    public String getFullDate() {
        return ("Current date is " + this.month + '/' + this.day + '/' + this.year);
    }

    public String getYear() {
        return ("Current year is " + this.year);
    }

    public void reasignDate(String month, int day, int year){
        this.year = year;
        this.month = month;
        this.day = day;
    }

}



//private class
class Car {
    String color;
    int power;

    Car(String color, int power) {
        this.color = color;

        this.power = power;
    }

    Car(int power) {
        this.power = power;
    }


    void start() {
        System.out.println("wrooom");
    }

    void descriptionOut() {
        System.out.println("colo: " + " power: " + this.power);
    }
}