import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of integers: ");
        int numIntegers = in.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for (int i = 0; i < numIntegers; i++) {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();
            
            numbers.add(num);
        }
        
        int mode = Collections.max(numbers, (a, b) -> Collections.frequency(numbers, a) - Collections.frequency(numbers, b));
        
        System.out.println("Mode: " + mode);
        
        in.close();
    }
}
