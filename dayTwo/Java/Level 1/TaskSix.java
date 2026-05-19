import java.util.Scanner;
public class TaskSix{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter length of Rectangle: ");
        double length = inputCollector.nextDouble();
        System.out.println("Enter width of Rectangle: ");
        double width = inputCollector.nextDouble();

        double area = length * width;

        
        System.out.printf("Area of Rectangle is: %.1f %n", area);
    
    }

}
