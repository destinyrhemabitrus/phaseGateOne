import java.util.Scanner;
public class TaskFive{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter Temperature in celsius: ");
        double tempCelsius = inputCollector.nextDouble();
        
        double fahrenheit = (tempCelsius * (9/5.0)) + 32;
        
        System.out.printf("Temperature is %.1f in Fahrenheit%n", fahrenheit);
    
    }

}
