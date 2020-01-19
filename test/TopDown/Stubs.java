import java.util.Arrays;

public class Stubs {
    public static int[] sortArrayStub(int [] arr){
//        return new int[]{1, 2, 3, 4};
        Arrays.sort(arr);
        return arr;
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
}
