import org.junit.jupiter.api.Assertions;
public class ParkingLotTest{

 
    @org.junit.jupiter.api.Test
    public void Test_That_parkingSlotMethod_Exists(){

        int[] carInput = {1};
        ParkingLot.parkingSlot(carInput);

    }

    @org.junit.jupiter.api.Test
    public void Test_That_parkingSlotMethod_HasEmptySlotsExists(){

        int[] carInput = {1,1};
        int[] actual = ParkingLot.parkingSlot(carInput);

        int[] expected = {0,0,0};
        Assertions.assertEquals(expected,actual);

    }

}
