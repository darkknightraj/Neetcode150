import org.w3c.dom.ls.LSOutput;
import  java.util.Arrays;
import java.util.Scanner;

//Brute force
public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ? ");
        int size = sc.nextInt();
        // declare array
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array  ? ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean isduplicate = false;
        //boolean result =duplicate(arr);
        //System.out.println(result);
        for(int i = 0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(isduplicate){
                break;
            }
        }
        System.out.println(isduplicate);
    }
//        static boolean duplicate(int[] arr){
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    return  true;
//                }
//            }
//        }
//        return  false;
//
//    }
}
