import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProgramTest {
    Program p = new Program();
    int[] arr0 = new int[0];
    int[] arr1 = new int[1];
    int[] arr5 = new int[5];
    int[] arr10 = new int[10];
    @Before
    public void setUp() throws Exception {
        arr1[0]=0;
        arr5[0]=0;
        arr5[1]=1;
        arr5[2]=2;
        arr5[3]=3;
        arr5[4]=4;
        for( int i = 0 ; i < arr10.length;i++)
            arr10[i]=i;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sizeBottomUp () {
        assertTrue(Program.size(arr0)==0);
        assertTrue(Program.size(arr1)==1);
        assertTrue(Program.size(arr5)==5);
        assertTrue(Program.size(arr10)==10);
    }

    @Test
    public void printArrBottomUp() {
        assertTrue(1==1);
    }

    @Test
    public void maxValueBottomUp() {
        try{
            Program.maxValue(arr0);
        }
        catch (Exception e){assertTrue(1==1);}

        assertTrue(Program.maxValue(arr1)==0);
        assertTrue(Program.maxValue(arr5)==5-1);
        assertTrue(Program.maxValue(arr10)==10-1);
    }

    @Test
    public void minValueBottomUp() {
        try{
            Program.minValue(arr0);
        }
        catch (Exception e){assertTrue(1==1);}

        assertTrue(Program.minValue(arr1)==0);
        assertTrue(Program.minValue(arr5)==5-5);
        assertTrue(Program.minValue(arr10)==10-10);
    }

    @Test
    public void sumMinMaxBottomUp() {
        try{
            Program.sumMinMax(arr0);
        }
        catch (Exception e){assertTrue(1==1);}
        arr1[0]=100;
        arr5[0]=100;
        arr10[0]=100;
//        int ans1=Program.sumMinMax(arr1);
//        int ans5=Program.sumMinMax(arr5);
//        int ans10=Program.sumMinMax(arr10);
        assertTrue(Program.sumMinMax(arr1)==0);
        assertTrue(Program.sumMinMax(arr5)==4);
        assertTrue(Program.sumMinMax(arr10)==9);
    }


    @Test
    public void minValueIndexBottomUp() {
        try{
            Program.minValueIndex(arr0);
        }
        catch (Exception e){assertTrue(1==1);}

        assertTrue(Program.minValueIndex(arr1)==0);
        assertTrue(Program.minValueIndex(arr5)==4-4);
        assertTrue(Program.minValueIndex(arr10)==9-9);
        arr5[2]=-1;
        arr10[2]=-1;
        assertTrue(Program.minValueIndex(arr5)==2);
        assertTrue(Program.minValueIndex(arr10)==2);
    }

    @Test
    public void maxValueIndexBottomUp() {
        try{
            Program.maxValueIndex(arr0);
        }
        catch (Exception e){assertTrue(1==1);}

        assertTrue(Program.maxValueIndex(arr1)==0);
        assertTrue(Program.maxValueIndex(arr5)==4);
        assertTrue(Program.maxValueIndex(arr10)==9);
        arr5[2]=100;
        arr10[2]=100;
        assertTrue(Program.maxValueIndex(arr5)==2);
        assertTrue(Program.maxValueIndex(arr10)==2);
    }

    @Test
    public void copyArrBottomUp() {
        assertTrue(Program.copyArr(arr0).length==0);
        assertTrue(Arrays.equals(arr1, Program.copyArr(arr1)));
        assertTrue(Arrays.equals(arr5, Program.copyArr(arr5)));
        assertTrue(Arrays.equals(arr1, Program.copyArr(arr10)));

    }

    @Test
    public void swapMinMaxBottomUp() {
        int[] copyArr1 = Program.swapMinMax(arr1);
        int[] copyArr5 = Program.swapMinMax(arr5);
        int[] copyArr10 = Program.swapMinMax(arr10);
        assertTrue(copyArr10[0]==9 && copyArr10[9]==0);
        assertTrue(copyArr5[0]==4 && copyArr5[4]==0);
        assertTrue(copyArr1[0]==0);
    }

    @Test
    public void sortArrayBottomUp() {
        int[] copyArr1 = Program.sortArray(arr1);
        int[] copyArr5 = Program.sortArray(arr5);
        int[] copyArr10 = Program.sortArray(arr10);
        assertTrue(reallySorted(copyArr1));
        assertTrue(reallySorted(copyArr5));
        assertTrue(reallySorted(copyArr10));
    }

    @Test
    public void equalArraysBottomUp() {
        assertTrue( Program.equalArrays(arr1,arr1));
        assertTrue( Program.equalArrays(arr5,arr5));
        assertTrue( Program.equalArrays(arr10,arr10));
        assertFalse( Program.equalArrays(arr10,arr1));
        assertFalse( Program.equalArrays(arr10,arr5));
        assertFalse( Program.equalArrays(arr1,arr5));

    }

    private boolean reallySorted(int [] arr)
    {
        for (int i = 0; i< arr.length-1; i++){
            if (arr[i]>arr[i+1])
                return 1==0;
        }
        return 1==1;
    }

    @Test
    public void isSortedBottomUp() {
//        try {
//            assertTrue(Program.isSorted(arr0));
//        }
//        catch (Exception e){ assertTrue(1==1);}
        assertTrue(Program.isSorted(arr10));
        assertTrue(Program.isSorted(arr5));
        assertTrue(Program.isSorted(arr1));
        arr5[0]=100;
        arr10[0]=100;
        assertFalse(Program.isSorted(arr10));
        assertFalse(Program.isSorted(arr5));
    }

    @Test
    public void mergeBottomUp() {
        int [] mergeAndSort=Program.merge(arr5,arr10);

        int [] ans = new int [arr10.length+arr5.length];
        int x = 0;
        for (int i = 0; i< arr10.length; i++){
            ans[x]=arr10[i];
            x++;
        }
        for (int i = 0; i< arr5.length; i++){
            ans[x]=arr5[i];
            x++;
        }
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(mergeAndSort));
        assertTrue(Arrays.equals(ans,mergeAndSort));

    }

    @Test
    public void printSorted() {
    }
}