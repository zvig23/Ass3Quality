import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumMinMaxTopDown {

    private static int[] arr1;
    private static int expectedSum1;
    private static int[] arr2;
    private static int expectedSum2;

    @BeforeClass
    public static void init(){

    }

    @Before
    public void initTest(){
        arr1 = new int[]{7, 4, 1, 2, 3, 9, 15};
        expectedSum1 = 16;//1 + 15
        arr2 = new int[]{7, 4, 5, 2, 3, 9, 6};
        expectedSum2 = 11;//2 + 9
    }

    //In this test, every call to a lower-level method from sumMinMax is a stub.
    public static int SumMinMaxTest(int[] arr) { return Stubs.minValueStub(arr) + Stubs.maxValueStub(arr); }

    @Test
    public void SumMinMaxTopDownTest(){
        int actualSum = SumMinMaxTest(arr1);
        assertEquals(expectedSum1, actualSum);
    }

    //In this test, minValue's minValueIndex and maxValue are stubs.
    public static int SumMinMaxTest2(int[] arr) { return Stubs.minValue_maxValueIndexStub(arr) + Stubs.maxValueStub(arr); }

    @Test
    public void SumMinMaxTopDownTest2(){
        int actualSum = SumMinMaxTest2(arr1);
        assertEquals(expectedSum1, actualSum);
    }

    //In this test, minValue's maxValueIndex and maxValue's maxValueIndex are stubs.
    public static int SumMinMaxTest3(int[] arr) { return Stubs.minValue_maxValueIndexStub(arr) + Stubs.maxValue_maxValueIndexStub(arr); }

    @Test
    public void SumMinMaxTopDownTest3(){
        int actualSum = SumMinMaxTest3(arr1);
        assertEquals(expectedSum1, actualSum);
    }

    //In this test, maxValue's maxValueIndex is a stub.
    public static int SumMinMaxTest4(int[] arr) { return Program.minValue(arr) + Stubs.maxValue_maxValueIndexStub(arr); }

    @Test
    public void SumMinMaxTopDownTest4(){
        int actualSum = SumMinMaxTest4(arr1);
        assertEquals(expectedSum1, actualSum);
    }

    // In this test, there are no stubs.
    @Test
    public void SumMinMaxTopDownTest5(){
        int actualSum = Program.sumMinMax(arr1);
        assertEquals(expectedSum1, actualSum);
    }

    @Test
    public void SumMinMaxTopDownTest6(){
        int actualSum = SumMinMaxTest(arr2);
        assertEquals(expectedSum2, actualSum);
    }

    @Test
    public void SumMinMaxTopDownTest7(){
        int actualSum = SumMinMaxTest2(arr2);
        assertEquals(expectedSum2, actualSum);
    }

    @Test
    public void SumMinMaxTopDownTest8(){
        int actualSum = SumMinMaxTest3(arr2);
        assertEquals(expectedSum2, actualSum);
    }

    @Test
    public void SumMinMaxTopDownTest9(){
        int actualSum = SumMinMaxTest4(arr2);
        assertEquals(expectedSum2, actualSum);
    }

    // In this test, there are no stubs.
    @Test
    public void SumMinMaxTopDownTest10(){
        int actualSum = Program.sumMinMax(arr2);
        assertEquals(expectedSum2, actualSum);
    }

    @AfterClass
    public static void finish(){

    }
}
