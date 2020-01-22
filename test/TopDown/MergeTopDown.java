import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class MergeTopDown {
    private static int[] first;
    private static int[] second;
    private static int[] expected;

    @BeforeClass
    public static void init(){
        first = new int[]{2, 1, 10, 4};
        second = new int[]{3, 7, 6, 5};
        expected = new int[]{1, 2, 3, 4, 5, 6, 7, 10};
    }

    // A copy of merge from Program, where every call to another function was replaced by stubs,
    // namely: sortArray got replaced by sortArrayStub
    // Merges two arrays "ar1" and "ar2" into one sorted array and returns it
    // In this test, the only lower-level module merge depends on (sortArray) is a full stub.
    public static int[] MergeTest(int[] ar1, int[] ar2) {
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return Stubs.sortArrayStub(ar2);
        if (ar2==null) return Stubs.sortArrayStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return Stubs.sortArrayStub(res);
    }

    @Test
    public void MergeTopDownTest(){

        int[] merged = MergeTest(first,second);
        assertArrayEquals(expected,merged);
    }


    // In this test, sortArray is not a stub but its own lower-level modules copyArr and size are stubs.
    public static int[] MergeTest2(int[] ar1, int[] ar2){
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return Stubs.sortArray_AllStubs(ar2);
        if (ar2==null) return Stubs.sortArray_AllStubs(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return Stubs.sortArray_AllStubs(res);
    }

    @Test
    public void MergeTopDownTest2(){
        int[] first = {2,1,10,4};
        int[] second = {3,7,6,5};
        int[] merged = MergeTest2(first,second);
        assertArrayEquals(expected,merged);
    }

    // In this test, sortArray is not a stub, and neither is its lower-level dependency copyArr.
    // However, copyArr depends on size(), so size is a stub for now.
    public static int[] MergeTest3(int[] ar1, int[] ar2){
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return Stubs.sortArray_SizeStub(ar2);
        if (ar2==null) return Stubs.sortArray_SizeStub(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return Stubs.sortArray_SizeStub(res);
    }

    @Test
    public void MergeTopDownTest3(){
        int[] first = {2,1,10,4};
        int[] second = {3,7,6,5};
        int[] merged = MergeTest3(first,second);
        assertArrayEquals(expected,merged);
    }

    // In this test, sortArray is not a stub, and neither are its lower-level dependencies copyArr and size.
    // However, copyArr depends on size(), so calls to size inside copyArr are stubs for now.
    public static int[] MergeTest4(int[] ar1, int[] ar2){
        if (ar1==null && ar2==null) return null;
        if (ar1==null) return Stubs.sortArray_NoStubs(ar2);
        if (ar2==null) return Stubs.sortArray_NoStubs(ar1);
        int[] res = new int[ar1.length+ar2.length];
        int i = 0;
        for(int j=0; j<ar1.length; j++)
            res[i++] = ar1[j];
        for(int j=0; j<ar2.length; j++)
            res[i++] = ar2[j];
        return Stubs.sortArray_NoStubs(res);
    }

    @Test
    public void MergeTopDownTest4(){
        int[] first = {2,1,10,4};
        int[] second = {3,7,6,5};
        int[] merged = MergeTest4(first,second);
        assertArrayEquals(expected,merged);
    }

    // In this test, there are no stubs.
    @Test
    public void MergeTopDownTest5(){
        int[] first = {2,1,10,4};
        int[] second = {3,7,6,5};
        int[] merged = Program.merge(first,second);
        assertArrayEquals(expected,merged);
    }

    @AfterClass
    public static void finish(){

    }
}
