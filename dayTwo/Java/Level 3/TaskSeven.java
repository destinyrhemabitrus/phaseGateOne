import java.util.Scanner;
public class TaskSeven{

    public static void main(String[] args){


        Scanner inputCollector = new Scanner(System.in);

        int total = 0;
        for(int counter = 1; counter <= 5; counter++){
        
            System.out.println("Enter a number: ");
            int number = inputCollector.nextInt();
            total = total + number;
    
        }
       
        System.out.printf("Sum is %d: %n", total);
     
         }

}
