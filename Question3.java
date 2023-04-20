
import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
		Scanner in = new Scanner(System.in);
		int num;

    // integer prompt
		// System.out.print("Enter an integer: ");
		num = in.nextInt();

    // integer multiply itself for square
		int result = num * num;
		// Print the result
    System.out.println(result);
    }
}
