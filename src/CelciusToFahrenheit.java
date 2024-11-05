import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please input value in Fahrenheit:");
        double f = Double.parseDouble(read.nextLine());
        double c;
        c= ((5.0/9)*(f-32));
        System.out.println((int)f+ "degrees in Fahrenheit is "+(int)c+" in Celcius");
    }
}

