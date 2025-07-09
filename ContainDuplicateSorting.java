import java.util.Scanner;
import  java.util.Arrays;

public class ContainDuplicateSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ? ");
        int size = sc.nextInt();
        //Declare array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array ? ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = containDuplicate(arr);
        System.out.println(result);
    }

    static boolean containDuplicate(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i]==arr[i+1]){
                return  true;
            }
        }
        return false;
    }

}

