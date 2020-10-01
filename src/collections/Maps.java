package collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new Hashtable<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            map.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.get(s) != null) {

                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
