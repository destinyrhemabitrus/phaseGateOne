import java.util.Scanner;
public class TaskFour{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int numberOne = inputCollector.nextInt();
        int numberTwo = inputCollector.nextInt();

        if(numberOne >numberTwo){

            System.out.printf("Largest is %d%n",numberOne);
                    
        }else{

            System.out.printf("Largest is %d%n",numberTwo);
        
        }
    
    }

}
