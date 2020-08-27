package Syntax;

public class StringSyntax {

    /**
     * String Objects are immutable
     * use the StringBuilder(thread-safe) and StringBuffer(not thread-safe) to get a mutable String
     */
    //store in a different place in the heap, 2 different objects
    String obj1 = new String("object");
    String obj2 = new String("object");

    //store at the same place in the heap, has same memory address
    String string1 = "same object";
    String string2 = "same object";

    public void invoke() {
        System.out.println("obj1 " + obj1 + " obj2 " + obj2);
        System.out.println("str1 " + string1 + " str2 " + string2);
        string1 = "Hey";
        System.out.println(" after change str1 " + string1 + " str2 " + string2); // .getClass().getSimpleName() -get type of obj  string2 will be an object without value
    }

    public void strBuilder() {
        System.out.println(string1);
        string1 += " Ho!"; //concat string
        System.out.println(string1);
        System.out.println();
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append(string1);
        System.out.println("StringBuilder " + sb + " str 1 " + string1);
    }

    public void clangeValues(String s) {
        /**
         * get access to object by reference,
         * but it will change object locally,
         * after function it will same as before
         */
        s = string1; //
        System.out.println("in change " + s);
    }

    public void checck() {
        System.out.println("1" + obj1);
        System.out.println("2" + obj2);
    }

}
