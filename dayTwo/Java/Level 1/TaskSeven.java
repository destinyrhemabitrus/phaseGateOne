import java.util.Scanner;
public class TaskSeven{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter Radius of Circle: ");
        double radius = inputCollector.nextDouble();

        double circumference = 2 * (22/7) * radius;

        
        System.out.printf("Circumference of circle is: %.1f %n", circumference);
    
    }

}
