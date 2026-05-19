import java.util.Scanner;
public class TaskNine{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter item price: ");
        double price = inputCollector.nextDouble();
        
        double tax = price * (10/100.0);
        double taxInclusivePrice = tax + price;
        
        System.out.printf("Total vat inclusive price: %.1f%n", taxInclusivePrice);
    
    }

}
