import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){


        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = inputCollector.nextInt();

        for(int counter = 1; counter <= 12; counter++){

            System.out.printf("%d x %d = %d%n",number,counter,number * counter);
            
        }
        
    }

}
