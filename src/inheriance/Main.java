package inheriance;


public class Main {
    public static void main(String[] args) {
        //---------------------------------------------------static blocks and block in inheritance
        /**
         * static block -> block -> constructor -> method/variable(called)
         */
//        Instructor i =  new Instructor();
//        i.sayHello();
//        System.out.println(Instructor.str1);

        // -----------------------------------------------------------------LAb-------------------------------------------------

        Liquid glue = new Liquid("Acme Glue", 2334, 4, InheritanceLab.UnitOfMeasureType.LITER,
                false, 15, 6);
        Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65,
                InheritanceLab.UnitOfMeasureType.GALLON, true, 0.70, 12);
        Solid anvil = new Solid("Acme Anvil", 1668, 0.3, InheritanceLab.UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5,
                0.5);

//        System.out.println(glue);
//        System.out.println(paint);
//        System.out.println(anvil);
//        System.out.println(anvil.canShipViaPostOffice());//method exist only in grand class
////        anvil.cantAccess() //illegal method private in parent and can't be called
//        InheritanceLab newLab=new Solid();
////        newLab.heyHo(); // illegal because parent has no method that exist in child
//        System.out.println(newLab.volume());//legal parent has same method(call parent method)
//
//        System.out.println("The weight of " + glue + " is " + glue.weight());
//        System.out.println("The weight of " + paint + " is " + paint.weight());
//        System.out.println("The weight of " + anvil + " is " + anvil.weight());
//
//        InheritanceLab x = glue;
//        System.out.println("Is " + x + " flammable?  " + x.getFlamable());
//        x = paint;
//        System.out.println("Is " + x + " flammable?  " + x.getFlamable());
        System.out.println(glue);
    }
}
