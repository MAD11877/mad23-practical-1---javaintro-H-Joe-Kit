import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length: ");
        int base = scanner.nextInt();
				//2 loops to print. 1st to print star repeatedly, second to print line
        for (int i = base; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
  }
}
