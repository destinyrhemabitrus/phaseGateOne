import java.util.Scanner;
public class TaskTen{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = inputCollector.nextInt();


        if(number%5 == 0 && number%3 == 0){
                
            System.out.println("Number is divisible by 5 and 3");
                    
        }else {

            System.out.println("Number is not divisible by 5 and 3");

        }
    
    }

}
