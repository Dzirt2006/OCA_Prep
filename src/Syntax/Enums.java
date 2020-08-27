package Syntax;

public class Enums {
    public void invoke(){
        //get access to enum data through the name of enum Class
        String en=Obj.CITROEN.name();  //key
        System.out.println("en str "+en);
        int en2=Obj.CITROEN.ordinal(); // value
        System.out.println("en2 int "+en2);
        Obj en3=Obj.VOLVO;
        System.out.println("en3 str "+en3); // all parametrs key/index/value
        Obj en4=Obj.valueOf("BMW"); //same as above
        System.out.println("en4 str "+en4); // all parametrs key/index/value
        System.out.println("BMW+ toString "+Obj.BMW.toString());
        //get values arr:
        Obj[] obj=Obj.values();
        for (Obj value : obj) {
            System.out.println(value);
        }
        //get data by index:
        Obj en5=Obj.values()[2];
        System.out.println("en5 Obj "+en5);


    }
}

enum Obj{
BMW(1),CITROEN(3),VOLVO(10);
    private int amount;

     Obj(int amount) {
        this.amount=amount;
    }

    public String toString(){
        return this.name()+" "+this.ordinal() + ' '+this.amount;
    }
}