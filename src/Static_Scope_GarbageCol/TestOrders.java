package Static_Scope_GarbageCol;

import Objects.MyDate;


public class TestOrders {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyDate date1 = new MyDate("april", 20, 2008);
        Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

        MyDate date2 = new MyDate("april", 10, 2008);
        Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);


        System.out.println("The tax Rate is currently: " +
                Order.taxRate);
        Order.computeTaxOn(3000.00);
        anvil.computeTax();
        balloons.computeTax();
        Order.setTaxRate(0.06);
        System.out.println("The tax Rate is currently: " +
                Order.taxRate);
        Order.computeTaxOn(3000.00);
        anvil.computeTax();
        balloons.computeTax();
        MyDate date3 = new MyDate("april", 20, 2008);
        Order anotherAnvil = new Order(date3, 200, "Road Runner");
        System.out.println(anotherAnvil);

    }

}
