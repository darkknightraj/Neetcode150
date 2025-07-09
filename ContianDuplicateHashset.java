import java.util.HashSet;
import java.util.Scanner;

public class ContianDuplicateHashset {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        //Declare array
        int[] arr = new int[size];
        System.out.println("Enter the element of the array ? ");
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean result = containDuplicate(arr);
        System.out.println(result);
    }
    static  boolean containDuplicate(int [] arr){
    HashSet<Integer> seeNumbers = new HashSet<>();
    //Iterate through element
    for(int  arrr : arr) {
    if(seeNumbers.contains(arrr)){
        return  true;
    }
    //add element to hashSet
        seeNumbers.add(arrr);
    }
    return  false;
    }
}
