package Abstract;

public abstract class Shape implements Drawable {
    /**
     * abstract class can implements
     * interfaces without method realization
     */
    abstract void area();

}


class Circle extends Shape {

    /**
     * We must implement all abstract methods
     * from parent + parent implemented interfaces
     * (if methods not implemented in parent)
     * in child class
     */
    @Override
    void area() {

    }

    @Override
    public void draw() {

    }
}

class Cube extends Shape {

    /**
     * We must implement all abstract methods
     * from parent + parent implemented interfaces
     * (if methods not implemented in parent)
     * in child class
     */
    @Override
    void area() {

    }

    @Override
    public void draw() {

    }
}

class Horse implements Drawable {
    private final int zeroX = Drawable.x;
    private final int zeroY = Drawable.y;


//    Drawable.hello(); illegal!

    void funt(){
        /**
         * call static methods from the function
         */
        Drawable.hello();// legal
    }
    @Override
    public void draw() {
        int zero = Drawable.x + Drawable.y;
        System.out.println(zero);
    }
}