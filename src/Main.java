import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element1, element2, element3, element4, element5;
        System.out.println("Enter first value");
        element1 = scanner.nextInt();
        System.out.println("Enter second value");
        element2 = scanner.nextInt();
        System.out.println("Enter third value");
        element3 = scanner.nextInt();
        System.out.println("Enter fourth value");
        element4 = scanner.nextInt();
        System.out.println("Enter fifth value");
        element5 = scanner.nextInt();
        Integer[] elements={element1, element2, element3, element4, element5};
        System.out.println("Choose method");
        int z = scanner.nextInt();
        switch (z){
            case 1:
                Arrays.sort(elements);
                System.out.println("Table after sorting - ascending: " + Arrays.toString(elements));
                break;
            case 2:
                Arrays.sort(elements, Collections.reverseOrder());
                System.out.println("Table after sorting - decreasing: " + Arrays.toString(elements));
                break;
        }
    }
}