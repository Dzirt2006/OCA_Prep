package Lambda;

import Objects.MyDate;

import java.util.ArrayList;

interface FuncInterface {
    // An abstract function
    int abstractFun(int x);
}


interface Printable {
    // A non-abstract (or default) function
    void normalFun(int x);
}



public class Lambd {
    public static void main(String args[]) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (x) -> (2 * x);
        
        // This calls above lambda expression and prints 10.
        Printable print = (x) -> System.out.println("Hello " + x);

        int y = fobj.abstractFun(5);
        print.normalFun(y);


        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });
    }
}





















