public class Level4{

    public static void main(String[] args){

        System.out.println(sum(4,5));
        System.out.println();

        evenNumber(4);
        System.out.println();

        System.out.println(square(5));
        System.out.println();

        System.out.println(fahrenheit(32));
        System.out.println();

        largest(3,4,2);
        System.out.println();

        System.out.println(simpleInterest(10000,10,2));
        System.out.println();


        System.out.println(areaRectangle(10,2));
        System.out.println();


        System.out.println(reverseNumber(543));
        System.out.println();


    
    }

    //TaskOne    
    public static int sum(int numberOne, int numberTwo){

        return numberOne + numberTwo;
    
    }


    //TaskTwo
    public static void evenNumber(int number){

        if(number%2 == 0){

            System.out.println("Number is even");  
        
        }else{

            System.out.println("Number is odd");

        }

    
    }


    //TaskThree
    public static int square(int number){
    
        return number * number;
    
    }

    //TaskFour
    public static double fahrenheit(double celcius){
    
        double fahrenheit = (celcius * (9/5.0)) + 32;
        return fahrenheit;
    
    }


    //TaskSix
    public static void largest(int numberOne, int numberTwo, int numberThree){
    
        int largest = numberOne;
        if(numberTwo > numberOne ){
    
            largest = numberTwo;
            System.out.printf("Largest is %d", largest);

        }else if(numberThree > numberTwo){

            largest = numberThree;
            System.out.printf("Largest is %d", largest);

        }else{

            System.out.printf("Largest is %d", largest);


        }
    
    }


    //TaskSeven
    public static double simpleInterest(double principal, double rate, double term){

        double simple_interest = (principal * rate * term)/100.0;
        return simple_interest;
    
    }

    //TaskEight
    public static int areaRectangle(int length, int width){

        int area = length * width;
        return area;
    
    }


    //TaskNine
    public static int reverseNumber(int number){

        int extract = 0;
        while(number != 0){

            int remainder = number%10;
            number = number/10;
            extract = extract * 10 + remainder;
        
        }        
        return extract;
    
    }
    



}
