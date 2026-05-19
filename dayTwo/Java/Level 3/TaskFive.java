import java.util.Scanner;
public class TaskFive{

    public static void main(String[] args){


        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = inputCollector.nextInt();

        int factorial = 1;
        for(int counter = number; counter >= 0; counter--){
    
            factorial = factorial * counter;
            
        }

        System.out.printf("%d factorial = %d", number, factorial);    
        
    }

}
