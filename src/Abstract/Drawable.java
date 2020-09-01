package Abstract;

interface Drawable {
    /**
     *We can't use any other modifiers other than public, static and final
     *By default, field is public, static and final
     */
    int x = 0; //Field
    int y = 0; //Field

    /**
     * static methods cannot be overridden or changed in the implementation class.
     */
    static void hello()
    {
        System.out.println("Hello, New Static Method Here");
    }

    /**
     * No need to use abstract keyword,
     * by default methods are public and abstract
     */
     void draw();
//    static
//    {
//        //compile time error
//        //SIB's are not allowed in interfaces
//    }
//
//    {
//        //Here also compile time error.
//        //IIB's are not allowed in interfaces
//    }
}
