
package advance.java;

import org.bson.types.Binary;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bethan
 */
public class Varargs {
    
    public static void main(String[] args) {
        Binary binary;
        String imem1 = "Apples";        
        String item2 = "Oranges";
        String item3 = "Pears";
//        printShoppingList(imem1, item2, item3);
//        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.next();
        byte bt=Byte.parseByte(sc);
        System.out.println(bt);
    }

    

    
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();

    }
    
    
}
