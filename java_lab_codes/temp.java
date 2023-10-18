import java.util.Scanner;
 
public class temp {
    public static void main(String args[]) {
        double celsius, fahren;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Temperature in Celsius");
        celsius = scanner.nextFloat();
 
        fahren = (9.0 / 5.0) * celsius + 32;
 
        System.out.println("Temperature in Fahrenheit = " + fahren);
    }
}