package inheriance;

public class NestesClasses {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
        Outer x = new Outer();
        x.outerMethod();
        Outer.StaticInner.mainStat();
    }
}

class Outer {

    //method with nested class
    static void outerMethod() { //made static for static class
        int x = 98;
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod() {
                System.out.println("x= " + x);//inner class has access to outer variables since jdk1.8
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }

    // A static inner class
    /**
     * static class has access only to static methods
     */
    static class StaticInner {
        public static void mainStat() {
            System.out.println("inside inner static class Method");
            outerMethod();
        }
    }

    // Simple nested inner class
    class Inner {
        public void show() {
            System.out.println("In a nested class method");
        }

        void innerMethod() {
            System.out.println("inside innerMethod");
        }
//        public static void print(){   //cannot be static
//            System.out.println("inside inner class Method");
//        }
    }

}

