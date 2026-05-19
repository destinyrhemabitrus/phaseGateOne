import java.util.Scanner;
public class TaskEight{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
         int number = 1;
        
        int total = 0;
        while(number != 0){
            System.out.println("Enter a number");
            number = inputCollector.nextInt();
            
            total = total + number;

        }
        System.out.printf("Total = %d%n", total);
       
     
     }

}
