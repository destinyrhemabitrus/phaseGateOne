import org.junit.jupiter.api.Assertions;
public class ArrayTest{

    @org.junit.jupiter.api.Test
    public void Test_that_vowelSeparatorMethod_Exists(){

        String[] words = {"Pie", "Fly", "Rat"};
        Array.vowelSeparator(words);        
    
    }


    @org.junit.jupiter.api.Test
    public void Test_that_vowelSeparatorMethod_ReturnsVowels(){

        String[] words = {"Pie", "Fly", "Rat"};       
        String[] actual = Array.vowelSeparator(words);
        String[] expected = {"Rat", "Fly", "Rat"};
        Assertions.assertEquals(expected,actual);

    }


    @org.junit.jupiter.api.Test
    public void Test_that_smallestToLargestMethodExist(){

        int[] originalNumbers = {14,9,6,5,8,10};

        Array.smallestToLargest(originalNumbers);

    }


    @org.junit.jupiter.api.Test
    public void Test_that_smallestToLargestMethod_InputedArrayReturnsCorrectArray(){

        int[] originalNumbers = {14,9,6,5,8,10};

        int[] actual = Array.smallestToLargest(originalNumbers);
        int[] expected = {5,6,7,8,9,10,11,12,13,14};
        Assertions.assertEquals(expected,actual);

    }


}
