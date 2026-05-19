import java.util.Scanner;
public class TaskTwo{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = inputCollector.nextInt();

        if(number < 0){

            System.out.println("Number is negative");
                    
        }else{

            System.out.println("Number is positive");
        
        }
    
    }

}
