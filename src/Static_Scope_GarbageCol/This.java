package Static_Scope_GarbageCol;

public class This {
    //class variable
    static int thisCount;
    //instance variable in This class
    int serialNumber;
    String color;
    String type;

    This() {
        //or this("green","cedan"); // will call This(String color, String type)
        thisCount++;
        serialNumber = 1290;
    }

    This(String color, String type) {
        this(); // Construction chain, same as This()
        this.color = color;
        this.type = type;
    }
}
