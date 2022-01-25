import java.util.*;
import java.io.*;

public class PhoneBook {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of phone book items to add: ");
        int n = input.nextInt();

        HashMap<String, Integer> map = new HashMap<>();
        input.nextLine();

        for ( int i = 0; i < n; i++ ) {

            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Enter phone: ");
            int phone = input.nextInt();
            map.put(name, phone);

            input.nextLine();
        }
        System.out.println("Enter name to check: ");
        while (input.hasNext()) {

            String s = input.nextLine();

            if ( map.containsKey(s)) {
                System.out.println( s + " = " + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
