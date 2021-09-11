import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
            int[] array = {1,2,5,6,95,39,3,5};
        //System.out.println("Array is = "+ Arrays.toString(array));
        reverse(array);
        //System.out.println("Reversed Array is = "+ Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        System.out.println("Array = "+Arrays.toString(array));
        int maxInt = array.length-1;
        int halfNumber = array.length / 2;
        for(int i = 0;i<halfNumber;i++) {
            int temp = array[i];
            array[i] = array[maxInt - i];
            array[maxInt - i] = temp;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));

    }
}
