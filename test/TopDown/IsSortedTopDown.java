import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IsSortedTopDown {

    @Before
    public void init(){

    }

    public static boolean IsSortedTest(int[] arr){
        int[] sorted = Stubs.sortArrayStub(arr);
        return Stubs.equalArraysStub(arr, sorted);
    }

    @Test
    public void IsSortedTopDownTest(){
        int[] falseArr = {2,1,10,4};
        boolean falseIsSorted = IsSortedTest(falseArr);
        assertFalse(falseIsSorted);
        int[] trueArr = {1,2,3,4,5,7,15};
        boolean trueIsSorted = IsSortedTest(trueArr);
        assertTrue(trueIsSorted);
    }

    @After
    public void finish(){

    }
}
