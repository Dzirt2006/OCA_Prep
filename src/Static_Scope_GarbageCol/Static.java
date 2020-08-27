package Static_Scope_GarbageCol;

//STATIC


public class Static {

    public void invoke() {
        Car myCar, myCar1 = new Car();//initialize last element in the list
        myCar = new Car();
        myCar.descriptionOut();//will be 2
        Car.resetCount();// call static members through the class name
        myCar.descriptionOut();//will be 0
        Car.carCount++;// call static members through the class name
        myCar.descriptionOut();//will be 1
    }
}

//private class
class Car {
    static{
        carCount=0;
    }

    /**
     *
     */

    static int carCount;//same value for all instances

    /**
     *
     * DO and Don't!
     */
    Math m=null;//DON'T
    double result = m.floor(28.15);// Confusing code, but it works.
    double resultRight = Math.floor(28.15); //right way!

    String color="blue";


    /**
     * @param count
     */
    Car(int count) {
        carCount = count;
    }

    Car() {
        carCount++;
    }

    /**
     * static methods do not have access to object data. Only static members
     */
    static void resetCount(){
        carCount=0;
//        color="black" //illegal
    }
    void descriptionOut() {
        System.out.println("count " + Car.carCount);
    }
}


/* //static blocks
public class Person {
    {
        personCount = 10;
    }
    static {
        personCount = 20;
    }
    private static int personCount = 1000;
    {
        personCount = 30;
    }
    static {
        personCount = 40;
    }
    public static void main(String[] args) {
        System.out.println(Person.personCount); //40
        Person p = new Person();
        System.out.println(Person.personCount);//30
        Person.personCount = 100;
        p = new Person();
        System.out.println(Person.personCount);//30
    }
}

 */