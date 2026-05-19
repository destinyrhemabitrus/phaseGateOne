public class Level5{

    public static void main(String[] args){

        int[] arr = {5, -9, 3, -6, 2, -11};

        int[] figures = {45,60,3,0,67,2,45,3,22,0};
        

    }

    //TaskTwo
    public static int[] negativeNumbers(int[] arr){

        for(int counter = 0; counter < arr.length; counter++){

            if(arr[counter] < 0){
        
                arr[counter] = 0;
                
            }

        }

        return arr;

    }


        
    //TaskFour
    public static int[] duplicate(int[] figures){

        int count = 0;
        int[] duplicate = new int[3];
        for(int counter = 0; counter < figures.length; counter++){

            if(figures[counter] == figures[counter]){
        
                duplicate[count] = figures[counter];
                count = count + 1;
            }


        }

        return duplicate;

    }


}
