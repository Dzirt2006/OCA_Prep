package Static_Scope_GarbageCol;

public class StaticAAndNonInPoly {
    public static void main(String[] args) {
        Parent.parentPrinter();
        Child child=new Child();
        child.printer();
        Child.parentPrinter();
        Parent parent=new Parent();
        Parent.parentPrinter();
    }
}

class Parent{
    public static int  count;
    //invokes only one time wherever it was static  method call or instance created
    static{
       count=9;
    }
    static void parentPrinter(){
        System.out.println("parent static method "+count);
    }
    {
        count+=7;
    }
}
class Child extends Parent{

    void printer(){
        System.out.println(count);
    }
    static void parentPrinter(){
        System.out.println("in child");
    }
}
