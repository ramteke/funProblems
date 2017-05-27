package PancakeSorting;

/**
 * Created by skynet on 27/05/17.
 */
public class Main {

    private  static void flip(int arr[], int i) {
        int start = 0;
        while (start < i) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    private static int getMaxindex(int arr[], int maxPos) {

        int maxIndex = 0;
        for (int i = 0; i < maxPos; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    public static void pancakeSorting(int arr[]) {

        for ( int index = arr.length ; index > 1; index--) { //0th index will be pre-positioned

            int maxIndex = getMaxindex(arr, index);

            if ( maxIndex != index -1) {
                flip(arr, maxIndex);
                flip(arr, index - 1);
                print(arr);
                System.out.println("");
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr [] = new int [] { 4,10, 100, 1000, 7, 1, 300, 19,20};

        pancakeSorting(arr);
        print(arr);

    }
}
