import java.util.Scanner;
public class TaskNine{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = inputCollector.nextInt();

        if(age >=18){

            System.out.println("You are an adult");
                    
        }
    
        if(age >=7){

            System.out.println("You are a Tennager");
                    
        }

        if(age < 7){

            System.out.println("You are a child");
                    
        }

    }

}
