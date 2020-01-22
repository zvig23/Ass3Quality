import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;

public class IsSortedTopDown {

    private static int[] arrUnsorted;
    private static int[] arrSorted;

    @BeforeClass
    public static void init(){

    }

    @Before
    public void initTest(){
        arrUnsorted = new int[]{4, 3, 6, 2, 8, 5, 7};
        arrSorted = new int[]{2, 3, 6, 9, 12, 16, 20};
    }

    //In this test, every call to a lower-level method from isSorted is a stub.
    public static boolean IsSortedTest(int[] arr) {
        int[] sorted = Stubs.sortArrayStub(arr);
        return Stubs.equalArraysStub(arr, sorted);
    }

    @Test
    public void PrintSortedTopDownTest(){
        boolean actualSorted = IsSortedTest(arrSorted);
        boolean actualUnsorted = IsSortedTest(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    @AfterClass
    public static void finish(){

    }
}
