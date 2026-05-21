public class Array{

    public static void main(String[] args){

        int[] numbers = {8,6,12,4,-2};
        int value = 6;

    }


    public static int[] sumFinder(int[] numbers, int value){
        
        
        for(int counter = 0; counter <= numbers.length - 1; counter++){

            for(int counterTwo = 0; counterTwo <= counter; counterTwo++){

                if(numbers[counter] + numbers[counterTwo] == value){
                    
                    numbers[counter] = numbers[counterTwo];
    
                }

            }
            
        }
        return numbers;

    }

}
