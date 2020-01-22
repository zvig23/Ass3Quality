import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapMinMaxTopDown {

    private static int[] arr;
    private static int[] expectedSwapped;

    @BeforeClass
    public static void init(){

    }

    @Before
    public void initTest(){
        arr = new int[]{1, 2, 4, 5, 8, 3, 10, 12};
        expectedSwapped = new int[]{12, 2, 4, 5, 8, 3, 10, 1};
    }

    //In this test, every call to a lower-level method from swapMinMax is a stub.
    public static int[] SwapMinMaxTest(int[] arr) {
        int[] res = Stubs.copyArrStub(arr);
        int minInd = Stubs.minValueIndexStub(arr);
        int maxInd = Stubs.maxValueStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    @Test
    public void SwapMinMaxTopDownTest(){
        int[] actualSwapped = SwapMinMaxTest(arr);
        assertArrayEquals(expectedSwapped, actualSwapped);
    }

    //In this test, copyArr and maxValue are stubs.
    public static int[] SwapMinMaxTest2(int[] arr) {
        int[] res = Stubs.copyArrStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Stubs.maxValueStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    @Test
    public void SwapMinMaxTopDownTest2(){
        int[] actualSwapped = SwapMinMaxTest2(arr);
        assertArrayEquals(expectedSwapped, actualSwapped);
    }

    //In this test, copyArr and maxValue's maxValueIndex are stubs.
    public static int[] SwapMinMaxTest3(int[] arr) {
        int[] res = Stubs.copyArrStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Stubs.maxValue_maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    @Test
    public void SwapMinMaxTopDownTest3(){
        int[] actualSwapped = SwapMinMaxTest3(arr);
        assertArrayEquals(expectedSwapped, actualSwapped);
    }

    //In this test, copyArr's size and maxValue's maxValueIndex are stubs.
    public static int[] SwapMinMaxTest4(int[] arr) {
        int[] res = Stubs.copyArr_SizeStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Stubs.maxValue_maxValueIndexStub(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    @Test
    public void SwapMinMaxTopDownTest4(){
        int[] actualSwapped = SwapMinMaxTest4(arr);
        assertArrayEquals(expectedSwapped, actualSwapped);
    }

    //In this test, copyArr's size is a stub.
    public static int[] SwapMinMaxTest5(int[] arr) {
        int[] res = Stubs.copyArr_SizeStub(arr);
        int minInd = Program.minValueIndex(arr);
        int maxInd = Program.maxValue(arr);
        if (minInd <0 || maxInd <0) return null;
        res[minInd] = arr[maxInd];
        res[maxInd] = arr[minInd];
        return res;
    }

    @Test
    public void SwapMinMaxTopDownTest5(){
        int[] actualSwapped = SwapMinMaxTest5(arr);
        assertArrayEquals(expectedSwapped, actualSwapped);
    }

    //In this test, there are no stubs.
    @Test
    public void SwapMinMaxTopDownTest6(){
        int[] actualSwapped = Program.swapMinMax(arr);
        assertArrayEquals(expectedSwapped, actualSwapped);
    }

    @AfterClass
    public static void finish(){

    }
}
