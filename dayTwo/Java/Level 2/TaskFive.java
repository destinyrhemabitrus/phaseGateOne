import java.util.Scanner;
public class TaskFive{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int numberOne = inputCollector.nextInt();
        int numberTwo = inputCollector.nextInt();
        int numberThree = inputCollector.nextInt();

        int largest = numberOne;
        if(numberTwo > numberOne){
                
            largest = numberTwo;

            System.out.printf("Largest is %d%n",numberTwo);
                    
        }else if(numberThree > numberTwo){

            largest = numberThree;
            System.out.printf("Largest is %d%n",numberThree);
        
        } else{

            System.out.printf("Largest is %d%n",numberOne);

        }
    
    }

}
