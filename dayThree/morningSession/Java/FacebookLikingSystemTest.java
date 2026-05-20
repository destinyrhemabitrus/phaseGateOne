import org.junit.jupiter.api.Assertions;
public class FacebookLikingSystemTest{

    @org.junit.jupiter.api.Test
    public void Test_That_likedByPeopleMethod_Exists(){

        String[] liked = new String[0];
        //FacebookLikingSystem.likedByPeople(liked);
        
        //org.junit.jupiter.api.Assertions.assertEquals()

    }

    @org.junit.jupiter.api.Test
    public void Test_That_likedByPeopleMethod_ReturnsNoOneLiked_EmptyArrayPassed(){

        String[] liked = {};
        String actual = FacebookLikingSystem.likedByPeople(liked);
        String expected = "no one liked";

        Assertions.assertEquals(expected, actual);

    }



}


