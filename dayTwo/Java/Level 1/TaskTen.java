import java.util.Scanner;
public class TaskTen{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter three numbers of your choice: ");
        int numberOne = inputCollector.nextInt();
        int numberTwo = inputCollector.nextInt();
        int numberThree = inputCollector.nextInt();
        
        int average = (numberOne + numberTwo + numberThree)/3;
        
        System.out.printf("Average: %d%n", average);
    
    }

}
