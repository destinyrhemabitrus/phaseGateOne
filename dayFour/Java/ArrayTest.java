import org.junit.jupiter.api.Assertions;
public class ArrayTest{

    @org.junit.jupiter.api.Test
    public void Test_that_sumFinderMethod_Exists(){

        int[] numbers = {8,6,12,4,-2};
        int value = 6;        
        Array.sumFinder(numbers,6);

    }


    @org.junit.jupiter.api.Test
    public void Test_that_sumFinderMethod_ReturnsArrayNumbersThatCanSumUpToVAlue(){

        int[] numbers = {8,6,12,4,-2};
        int value = 6;        
        int[] actual = Array.sumFinder(numbers,value);
        int[] expected = {8, -2};
        Assertions.assertEquals(expected,actual);

    }


}
