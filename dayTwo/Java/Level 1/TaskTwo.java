import java.util.Scanner;
public class TaskTwo{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = inputCollector.nextLine();
        
        System.out.println("How old are you");
        int age = inputCollector.nextInt();

        int futureAge = age + 5;
        System.out.printf("%s, You will be %d years old in 5 years time %n", name, futureAge);
    
    }

}
