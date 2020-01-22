import java.util.Arrays;

public class Stubs {
    //<editor-fold desc="Atomic Stubs">
    public static int[] sortArrayStub(int [] arr){
//        return new int[]{1, 2, 3, 4};
        int[] sorted = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        return sorted;
    }

    public static boolean equalArraysStub(int[] arr1, int[] arr2) {
//        return true;
        return Arrays.equals(arr1,arr2);
    }

    public static int[] copyArrStub(int[] arr){
//        return new int[]{1,2,3,4};
        return Arrays.copyOf(arr,arr.length);
    }

    public static int minValueStub(int[] arr){
//        return 0;
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        return arr2[0];
    }

    public static int maxValueStub(int[] arr){
//        return 100;
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        return arr2[arr2.length - 1];
    }

    public static int minValueIndexStub(int[] arr){
        return 0;
    }

    public static int maxValueIndexStub(int[] arr){
        return arr.length - 1;
    }

    public static void printArrStub(int[] arr){
        System.out.println("print arr Stub");
    }

    public static int sizeStub(int[] arr){
//        return 10;
        return arr.length;
    }
    //</editor-fold>

    //<editor-fold desc="Merge Complex Stubs">
    public static int[] sortArray_AllStubs(int [] arr){
        if (arr == null) return null;
        int[] res = copyArrStub(arr);
        for(int i=0; i<sizeStub(arr); i++)
            for (int j=0; j<sizeStub(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int[] copyArr_SizeStub(int[] arr){
        if (arr == null) return null;
        int[] res = new int[sizeStub(arr)];
        for(int i=0; i<sizeStub(arr); i++)
            res[i] = arr[0];
        return res;
    }

    public static int[] sortArray_SizeStub(int [] arr){
        if (arr == null) return null;
        int[] res = copyArr_SizeStub(arr);
        for(int i=0; i<sizeStub(arr); i++)
            for (int j=0; j<sizeStub(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }

    public static int[] sortArray_NoStubs(int[] arr){
        if (arr == null) return null;
        int[] res = copyArr_SizeStub(arr);
        for(int i=0; i<Program.size(arr); i++)
            for (int j=0; j<Program.size(arr)-i-1; j++)
                if (res[j]>res[j+1]) {
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
        return res;
    }
    //</editor-fold>

    //<editor-fold desc="IsSorted Complex Stubs">
    public static boolean equalArrays_SizeStub(int[] arr1, int[] arr2) {
        if (arr1==null && arr2 == null) return true;
        if (arr1==null || arr2 == null) return false;
        if (sizeStub(arr1)!=sizeStub(arr2)) return false;
        for (int i=0; i<sizeStub(arr1); i++)
            if (arr1[i]==arr2[i]) return true;
        return false;
    }
    //</editor-fold>

    //<editor-fold desc="SwapMinMax Complex Stubs">
    public static int maxValue_maxValueIndexStub(int[] arr) {
        int ind = maxValueIndexStub(arr);
        return arr[ind];
    }
    //</editor-fold>

    //<editor-fold desc="SumMinMax Complex Stubs">
    public static int minValue_maxValueIndexStub(int[] arr) {
        int ind = maxValueIndexStub(arr);
        return arr[ind];
    }
    //</editor-fold>
}
