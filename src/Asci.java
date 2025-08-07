import java.lang.reflect.Array;
import java.util.Arrays;

public class Asci {
    public static void main(String[] args) {
        char[] arr1 = new char[26];
        char[] arr2 = new char[26];
        char znak1 = 'a';
        char znak2 = 'A';
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = znak1++;
            arr2[i] = znak2++;

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr2[i]+" -> "+(int) arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+" -> "+(int) arr1[i]);
        }

        int[] arr3 = {1,2,3};
        int[] arr4 = {3,1,2};
        System.out.println(Arrays.equals(arr3,arr4));

    }
}
