import java.util.Random;
import java.util.Scanner;
public class NumberGuessingApp{

    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);
        Random random = new Random();
        
        
        System.out.println("You have 5 attempt to guess a number between 1-100");

        int count = 0;
        int accurateNumber;
        for(int counter = 1; counter <= 5; counter++){

            System.out.printf("Guess %d: %n",counter);
            int number = inputCollector.nextInt();

            while(number < 0 || number >100){

                System.out.println("Invalid number entered,Kindly enter a number between 1-100");
                number = inputCollector.nextInt();
            }
            accurateNumber = random.nextInt(100);
            if(number == accurateNumber){
                
                count = count + 1;
                
                if(count == 1){

                    System.out.printf("Correct number: %d%nattempts: %d%nrating: %s%n", accurateNumber,count,"Legendary");                
            
                }else if(count == 2){

                    System.out.printf("Correct number: %d%nattempts: %d%nrating: %s%n", accurateNumber,count,"Excellent");                

                }else if(count == 3){

                    System.out.printf("Correct number: %d%nattempts: %d%nrating: %s%n", accurateNumber,count,"Good");                

                }else if(count == 4){

                    System.out.printf("Correct number: %d%nattempts: %d%nrating: %s%n", accurateNumber,count,"Good");                
                }
                
                break;            

            }else{

                if(number > accurateNumber){
                    
                    System.out.println("Your answer is higher");                  
                    System.out.println("No win better luck");
                        
                    
                    
                }else{

                    System.out.println("Your answer is lower");
                    System.out.println("No win better luck");
            
                }
                    
            }

        }


    }

}
