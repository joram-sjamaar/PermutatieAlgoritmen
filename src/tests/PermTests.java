package tests;

import org.junit.jupiter.api.Test;
import utils.Numbers;
import static utils.Numbers.swapPerm;

public class PermTests {

    @Test
    public void SwapPermTest(){
        int[] testArray = {1,2,3,4,5};
        swapPerm(testArray);

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]+" ");
        }
    }
}
