package ExeptionsHandling;

import java.lang.*;

public class Propagate {
    public static void main(String[] args) {
        Propagate prop=new Propagate();
        try {
            prop.reversed("");
        }catch(Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Hey Ho!");
        }
    }

    String reversed(String str) throws Exception {
        if (str.length() < 1) {
            throw new Exception("Auchtung! ");
        }
        String reversed = "";
        for(int i=str.length()-1;i>=0;--i){ //without throw this expression is ok and doesn't throw ArrayBound Exception
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
