
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// height prompt
		System.out.println("Enter your height in meters: ");
		double height = in.nextDouble();

	  // weight prompt
    System.out.println("Enter your weight in kilograms: ");
    double weight = in.nextDouble();

		// BMI calculation & ouput
    double bmi = weight / (height * height);
    System.out.println("Your BMI is " + bmi);
  }
}
