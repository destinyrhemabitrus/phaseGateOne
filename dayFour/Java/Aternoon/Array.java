public class Array{

    public static void main(String[] args){

        String[] words = {"Pie", "Fly", "Rat"};
        int[] originalNumbers = {14,9,6,5,8,10};

    }

//    Task 3
    public static String[] vowelSeparator(String[] words){

        int count = 0;
       for(int counter = 0; counter < words.length; counter++){

            for(int counterTwo = 0; counterTwo < words[counter].length(); counterTwo++ ){

                if(words[counter].charAt(counterTwo) == 'a'){
                      
                    words[count] = words[counter];
                    count = count + 1;

                }
    
            }
    
        }
        
        return words;        

    }


    public static int[] smallestToLargest(int[] originalNumbers){

        for(int counter = 0; counter < originalNumbers.length; counter++){

           for(int counterTwo = 1; counterTwo < originalNumbers.length; counterTwo++ ){

                int largest = originalNumbers[counter];
                
                if(originalNumbers[counterTwo] > largest){

                    largest = originalNumbers[counterTwo];

                }

            }

        }

            return originalNumbers;

    }


}
