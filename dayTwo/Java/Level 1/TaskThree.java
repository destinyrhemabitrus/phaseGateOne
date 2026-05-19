import java.util.Scanner;
public class TaskThree{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter two numbers of your choice: ");
        int numberOne = inputCollector.nextInt();
        int numberTwo = inputCollector.nextInt();
        
        int sum = numberOne + numberTwo;
        
        System.out.printf("Sum: %d%n", sum);
    
    }

}
