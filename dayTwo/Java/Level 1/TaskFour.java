import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter two numbers of your choice: ");
        int numberOne = inputCollector.nextInt();
        int numberTwo = inputCollector.nextInt();
        
        int product = numberOne * numberTwo;
        
        System.out.printf("Product: %d%n", product);
    
    }

}
