import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PrintSortedTopDown {

    //Store original stream in a local variable (so we can switch it back later)
    private static final PrintStream out = System.out;
    private static final String theLnPart = "\r\n";

    //Our new stream. We will use it to assess whether or not the program prints correctly
    private static final ByteArrayOutputStream ourOut = new ByteArrayOutputStream();

    private static int[] arr;

    @BeforeClass
    public static void init(){
        //Switch the streams
        System.setOut(new PrintStream(ourOut));
    }

    @Before
    public void initTest(){
        arr = new int[]{5, 2, 13, 8, 9, 3, 7};
    }

    //In this test, every call to a lower-level method from printSorted is a stub.
    public static void PrintSortedTest(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        Stubs.printArrStub(arr);
        arr = Stubs.sortArrayStub(arr);
        Stubs.printArrStub(Stubs.sortArrayStub(arr));
        Stubs.printArrStub(arr);
    }

    @Test
    public void PrintSortedTopDownTest(){
        PrintSortedTest(arr);
        String printed = ourOut.toString();
        String expected = "print arr Stub" + theLnPart + "print arr Stub" + theLnPart + "print arr Stub" + theLnPart;
        assertEquals(expected,printed);
    }

    //In this test, printArr is no longer a stub.
    public static void PrintSortedTest2(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        Program.printArr(arr);
        arr = Stubs.sortArrayStub(arr);
        Program.printArr(Stubs.sortArrayStub(arr));
        Program.printArr(arr);
    }

    @Test
    public void PrintSortedTopDownTest2(){
        PrintSortedTest2(arr);
        String printed = ourOut.toString();
        String expected = "5 2 13 8 9 3 7 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart;
        assertEquals(expected,printed);
    }

    //In this test, printArr and sortArray are not stubs, but sortArray's copyArr and size are stubs.
    public static void PrintSortedTest3(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        Program.printArr(arr);
        arr = Stubs.sortArray_AllStubs(arr);
        Program.printArr(Stubs.sortArray_AllStubs(arr));
        Program.printArr(arr);
    }

    @Test
    public void PrintSortedTopDownTest3(){
        PrintSortedTest3(arr);
        String printed = ourOut.toString();
        String expected = "5 2 13 8 9 3 7 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart;
        assertEquals(expected,printed);
    }

    //In this test, printArr, sortArray and sortArray's copyArr are not stubs.
    //sortArray's copyArr's size and sortArray's size are stubs.
    public static void PrintSortedTest4(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        Program.printArr(arr);
        arr = Stubs.sortArray_SizeStub(arr);
        Program.printArr(Stubs.sortArray_SizeStub(arr));
        Program.printArr(arr);
    }

    @Test
    public void PrintSortedTopDownTest4(){
        PrintSortedTest4(arr);
        String printed = ourOut.toString();
        String expected = "5 2 13 8 9 3 7 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart;
        assertEquals(expected,printed);
    }

    //In this test, printArr, sortArray and sortArray's copyArr and size are not stubs.
    //sortArray's copyArr's size is a stubs.
    public static void PrintSortedTest5(int[] arr) {
        if (arr==null)
            System.out.println("No array");
        Program.printArr(arr);
        arr = Stubs.sortArray_NoStubs(arr);
        Program.printArr(Stubs.sortArray_NoStubs(arr));
        Program.printArr(arr);
    }

    @Test
    public void PrintSortedTopDownTest5(){
        PrintSortedTest5(arr);
        String printed = ourOut.toString();
        String expected = "5 2 13 8 9 3 7 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart;
        assertEquals(expected,printed);
    }

    // In this test, there are no stubs.
    @Test
    public void PrintSortedTopDownTest6(){
        Program.printSorted(arr);
        String printed = ourOut.toString();
        String expected = "5 2 13 8 9 3 7 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart
                + "2 3 5 7 8 9 13 " + theLnPart;
        assertEquals(expected,printed);
    }

    @AfterClass
    public static void finish(){
        System.setOut(out);
    }
}
