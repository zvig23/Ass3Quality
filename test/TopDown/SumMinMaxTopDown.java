import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumMinMaxTopDown {

    private static int[] arr;
    private static int expectedSum;

    @BeforeClass
    public static void init(){

    }

    @Before
    public void initTest(){
        arr = new int[]{7, 4, 1, 2, 3, 9, 15};
        expectedSum = 16;//1 + 15
    }

    //In this test, every call to a lower-level method from sumMinMax is a stub.
    public static int SumMinMaxTest(int[] arr) { return Stubs.minValueStub(arr) + Stubs.maxValueStub(arr); }

    @Test
    public void SumMinMaxTopDownTest(){
        int actualSum = SumMinMaxTest(arr);
        assertEquals(expectedSum, actualSum);
    }

    //In this test, minValue's minValueIndex and maxValue are stubs.
    public static int SumMinMaxTest2(int[] arr) { return Stubs.minValue_maxValueIndexStub(arr) + Stubs.maxValueStub(arr); }

    @Test
    public void SumMinMaxTopDownTest2(){
        int actualSum = SumMinMaxTest2(arr);
        assertEquals(expectedSum, actualSum);
    }

    //In this test, minValue's maxValueIndex and maxValue's maxValueIndex are stubs.
    public static int SumMinMaxTest3(int[] arr) { return Stubs.minValue_maxValueIndexStub(arr) + Stubs.maxValue_maxValueIndexStub(arr); }

    @Test
    public void SumMinMaxTopDownTest3(){
        int actualSum = SumMinMaxTest3(arr);
        assertEquals(expectedSum, actualSum);
    }

    //In this test, maxValue's maxValueIndex is a stub.
    public static int SumMinMaxTest4(int[] arr) { return Program.minValue(arr) + Stubs.maxValue_maxValueIndexStub(arr); }

    @Test
    public void SumMinMaxTopDownTest4(){
        int actualSum = SumMinMaxTest4(arr);
        assertEquals(expectedSum, actualSum);
    }

    // In this test, there are no stubs.
    @Test
    public void SumMinMaxTopDownTest5(){
        int actualSum = Program.sumMinMax(arr);
        assertEquals(expectedSum, actualSum);
    }

    @AfterClass
    public static void finish(){

    }
}
