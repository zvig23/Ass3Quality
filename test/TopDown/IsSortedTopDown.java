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
    public void IsSortedTopDownTest(){
        boolean actualSorted = IsSortedTest(arrSorted);
        boolean actualUnsorted = IsSortedTest(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    //In this test, sortArray is a Stub, and equalArrays' size is a stub.
    public static boolean IsSortedTest2(int[] arr) {
        int[] sorted = Stubs.sortArrayStub(arr);
        return Stubs.equalArrays_SizeStub(arr, sorted);
    }

    @Test
    public void IsSortedTopDownTest2(){
        boolean actualSorted = IsSortedTest2(arrSorted);
        boolean actualUnsorted = IsSortedTest2(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    //In this test, sortArray's copyArr and size are Stubs, and equalArrays' size is a stub.
    public static boolean IsSortedTest3(int[] arr) {
        int[] sorted = Stubs.sortArray_AllStubs(arr);
        return Stubs.equalArrays_SizeStub(arr, sorted);
    }

    @Test
    public void IsSortedTopDownTest3(){
        boolean actualSorted = IsSortedTest3(arrSorted);
        boolean actualUnsorted = IsSortedTest3(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    //In this test, sortArray's copyArr and size are Stubs.
    public static boolean IsSortedTest4(int[] arr) {
        int[] sorted = Stubs.sortArray_AllStubs(arr);
        return Program.equalArrays(arr, sorted);
    }

    @Test
    public void IsSortedTopDownTest4(){
        boolean actualSorted = IsSortedTest4(arrSorted);
        boolean actualUnsorted = IsSortedTest4(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    //In this test, sortArray's size and copyArr's size are Stubs.
    public static boolean IsSortedTest5(int[] arr) {
        int[] sorted = Stubs.sortArray_SizeStub(arr);
        return Program.equalArrays(arr, sorted);
    }

    @Test
    public void IsSortedTopDownTest5(){
        boolean actualSorted = IsSortedTest5(arrSorted);
        boolean actualUnsorted = IsSortedTest5(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    //In this test, copyArr's size is a Stub.
    public static boolean IsSortedTest6(int[] arr) {
        int[] sorted = Stubs.sortArray_NoStubs(arr);
        return Program.equalArrays(arr, sorted);
    }

    @Test
    public void IsSortedTopDownTest6(){
        boolean actualSorted = IsSortedTest6(arrSorted);
        boolean actualUnsorted = IsSortedTest6(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    // In this test, there are no stubs.
    @Test
    public void IsSortedTopDownTest7(){
        boolean actualSorted = Program.isSorted(arrSorted);
        boolean actualUnsorted = Program.isSorted(arrUnsorted);
        assertTrue(actualSorted);
        assertFalse(actualUnsorted);
    }

    @AfterClass
    public static void finish(){

    }
}
