import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class twoSum {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array ");
//        int size= sc.nextInt();
        //declare the array
        int[] nums = new int[5];
        //enter the elements of the array
        System.out.println("Enter the element of the array ");
        for(int i = 0;i<5;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target value ");
        int target = sc.nextInt();

        int [] result = twosum(nums,target);
        System.out.println(Arrays.toString(result));
    sc.close();
    }
    static int[] twosum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        //Iterate through array
        for(int i =0 ;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};

    }
}
