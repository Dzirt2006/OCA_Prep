package collections;

import java.util.Scanner;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            int n = scan.nextInt();
            ArrayList<Integer> nest = new ArrayList<>(n);
            for(int j=0;j<n;j++){
                int temp=scan.nextInt();
                nest.add(temp);
            }
            arr.add(nest);
        }
//        System.out.println(arr);
//        System.out.println("next");
        k = scan.nextInt();
        for(int i=0;i<k;i++){
            int n = scan.nextInt();
            List result=arr.get(n-1);
            try{
                n = scan.nextInt();
                int results= (int) result.get(n-1);
                System.out.println(results);
            }catch(IndexOutOfBoundsException e){
                System.out.println("Error!");
            }
        }
        scan.close();
//        System.out.println("Scan closed");
    }
}

class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }

    void printType(int x) {
        System.out.println(x + " is an int");
    }

    void printType(float x) {
        System.out.println(x + " is an float");
    }

    void printType(double x) {
        System.out.println(x + " is an double");
    }

    void printType(char x) {
        System.out.println(x + " is an char");
    }
}