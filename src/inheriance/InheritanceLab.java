package inheriance;

public class InheritanceLab {
    private String name;
    private int modelNumber;
    private double height;
    private UnitOfMeasureType unitOfMeasure;
    private boolean flammable = true;
    private double weightPerUofM;

    //constructor
    public InheritanceLab(){

    }
    public InheritanceLab(String name, int modelNumber, double height,
                          UnitOfMeasureType uoM, boolean flammable, double wgtPerUoM) {
        this.name = name;
        this.modelNumber = modelNumber;
        this.height = height;
        this.unitOfMeasure = uoM;
        this.flammable = flammable;
        this.weightPerUofM = wgtPerUoM;
    }

    public void setFlammable(boolean flammable) {
        this.flammable = flammable;
    }

    //accessors
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeightPerUofM() {
        return weightPerUofM;
    }

    public void setWeightPerUofM(double weightPerUofM) {
        this.weightPerUofM = weightPerUofM;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    //mutators
    public void setName(String name) {
        this.name = name;
    }

    public UnitOfMeasureType getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public boolean getFlamable() {
        return flammable;
    }

    public String toString() {
        return name + "-" + modelNumber;
    }

    //methods

    public double volume() {
        return 0.0;
    }

    public double weight() {
        return volume() * weightPerUofM;
    }

    public enum UnitOfMeasureType {
        LITER, GALLON, CUBIC_METER,
        CUBIC_FEET
    }

    public final boolean canShipViaPostOffice() {
       return flammable;
    }
    private void cantAccess() {
        System.out.println("Whoohaa!");
    }
}

class Liquid extends InheritanceLab {
    private double radius;

    public Liquid(){}

    public Liquid(String name, int modelNumber, double height,
                  UnitOfMeasureType uoM, boolean flammable, double wgtPerUofM,
                  double radius) {
        super(name, modelNumber, height, uoM, flammable, wgtPerUofM);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double volume() {
        return Math.PI * radius * radius * getHeight();
    }


    public String toString() {
        return super.toString() + " (liquid) " + volume() + " " +
                getUnitOfMeasure();
    }
}

class Solid extends InheritanceLab {
    private double width;
    private double length;

    public Solid(){}
    public Solid(String name, int modelNumber, double height,
                 UnitOfMeasureType uoM, boolean flammable, double wgtPerUofM,
                 double width, double length) {
        super(name, modelNumber, height, uoM, flammable, wgtPerUofM);
        this.width = width;
        this.length = length;
    }


    public double volume() {
        return width * length * getHeight();
    }


    public String toString() {
        return super.toString() + " that is " + volume() + " " +
                getUnitOfMeasure() + " in size";
    }

    public void heyHo(){
        System.out.println("Hey Ho");
    }
}