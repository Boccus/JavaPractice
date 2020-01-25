import java.util.Scanner; 

public class FahrenheitToCelsius {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double fahrenheit = in.nextDouble();
		double celsius = (fahrenheit - 32) * (5.0/9.0);

		System.out.println(celsius);
	}
}