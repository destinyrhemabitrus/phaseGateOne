import java.util.Scanner;
public class TaskOne{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = inputCollector.nextLine();

        System.out.printf("Welcome! %s%n", name);
    
    }

}
