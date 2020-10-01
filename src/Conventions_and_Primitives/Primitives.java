package Conventions_and_Primitives;

public class Primitives {
    /*
     * boolean=1 bit
     * byte=8 bits
     * short=16 bits
     * char 32 bits
     * int=32 bits
     * float=32 bits
     * long=64 bits
     * double=64 bits
     */

    /**
     * weight conversion rates
     */
// conversion rate for 1 kilogram to pounds
    public static double kilogramToPounds = 2.2046;
    // conversion rate for 1 kilogram to grams
    public static int kilogramToGrams = 1000;
    // conversion rate for 1 kilogram to weight ounces
    public static double kilogramToOunces = 35.274;
    /**
     * volume conversion rates
     */
// conversion rate for 1 liter to fluid ounces
    public static float literToFluidOunce = 33.814f;
    // conversion rate for 1 liter to gallons
    public static float literToGallon = 0.2642f;
    // conversion rate for 1 liter to pints
    public static float literToPints = 2.1134f;
    // conversion rate for 1 liter to milliliters
    public static short litertoMilliliters = 1_000;
    /**
     * Same things
     */
    int one = 1234567;
    int otherOne = 1_234_567;


    // LAB Part-----------------------------------------------------------------------------------------------------------
    /**
     * Same things
     */
    double two = 1.234567;
    double otherTwo = 1.234_567;
    double many = 30_210.50;//legal!
    char c = 4; // unicode ''
    /**
     * example below is fine till x can fit in byte var ( 0-127)
     */

    int x = 127;
    byte b = (byte) x;
    float f = 3.14f; // won't compile without 'f'

    public static double pounds(double kilograms) {
        return kilograms * kilogramToPounds;
    }

    public static int grams(int kilograms) {
        return kilograms * kilogramToGrams;
    }

    public static double ounces(double kilograms) {
        return kilograms * kilogramToOunces;
    }

    public static float fluidOunces(float liters) {
        return liters * literToFluidOunce;
    }

    public static float gallons(float liters) {
        return liters * literToGallon;
    }

    public static float pints(float liters) {
        return liters * literToPints;
    }

    public static int milliliters(int liters) {
        return liters * litertoMilliliters;
    }

    public static void main(String[] args) {
        Primitives p = new Primitives();
        System.out.println(p.c);
        System.out.println(p.b);

        //lab

        System.out.println(Primitives.fluidOunces(1.1f));
        System.out.println(Primitives.gallons(2.2f));
        System.out.println(Primitives.grams(30));
        System.out.println(Primitives.milliliters(40));
        System.out.println(Primitives.ounces(50));
        System.out.println(Primitives.pints(6.6f));
        System.out.println(Primitives.pounds(7.7));

        // can you figure out why these do not compile
        Primitives.fluidOunces(1.1f);
        //ConversionService.grams(30L);
        //ConversionService.milliliters(4.0);
        //short grams = ConversionService.grams(30);
        //byte byteGrams = ConversionService.grams(30);

        // why do these still work even though the types are different
		/*
		System.out.println("------------------------------------");
		double ounces = ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		long milliliters = ConversionService.milliliters(40);
		System.out.println(milliliters);
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);
		short s = 30;
		System.out.println(ConversionService.grams(s));
		byte b = 4;
		System.out.println(ConversionService.milliliters(b));
		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		System.out.println(ConversionService.gallons(200));
		System.out.println(ConversionService.ounces(50.5f));
		System.out.println(ConversionService.pints(6L));
		System.out.println(ConversionService.pounds(7L));
		*/

        // compare these results.  Can you tell why they are different?

        System.out.println("------------------------------------");
        float bigGallons = Primitives.gallons(123456789123456789L);
        System.out.println(bigGallons);
        double bigGallons2 = 123456789123456789L * 0.2642;
        System.out.println(bigGallons2);


        int a[] = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.print(a[3] == b[0][2]);
        System.out.print(" " + (a[2] == b[2][1]));

		/*
		System.out.println("------------------------------------");
		int bigGrams = ConversionService.grams(1234567890);
		System.out.println(bigGrams);
		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);
		*/
    }

}
