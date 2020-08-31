package Syntax;

public class Syntax {
    public static void main(String[] args) {
        Syntax s = new Syntax();
//        if (s.TRUE() | s.FALSE()) {
//            System.out.println("true |");
//        }
//        if (s.TRUE() || s.FALSE()) {
//            System.out.println("true ||");
//        }
//        System.out.println("-------------------------");
//        if (s.TRUE() & s.FALSE()) {
//            System.out.println("true &");
//        }
//        if (s.TRUE() && s.FALSE()) {
//            System.out.println("true &&");
//        }
//        System.out.println("-------------------------");
//        if (s.FALSE() && s.TRUE()) {
//            System.out.println("true &");
//        }
//        if (s.FALSE() && s.TRUE()) {
//            System.out.println("true &&");
//        }
//        System.out.println("-------------------------");

        Enums en = new Enums();
//        en.invoke();
        StringSyntax strSyn=new StringSyntax();
        strSyn.invoke();
        strSyn.strBuilder();
        strSyn.clangeValues(strSyn.obj1);
        strSyn.checck();


    }

    private boolean TRUE() {
        System.out.println("true block called");
        return true;
    }

    private boolean FALSE() {
        System.out.println("false block called");
        return false;
    }


}
