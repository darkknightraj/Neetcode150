import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagramBrute {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "anagram";
        String  t = "nagaram";
        boolean result = validAnagram(s,t);
        System.out.println(result);

    }
    static  boolean validAnagram(String s , String t){
        //check the length of both string
        if(s.length() != t.length()){
            return  false;
        }
        char[] sArr=s.toCharArray();
        char[] tArr = t.toCharArray();
       // System.out.println(sArr);
        //System.out.println(tArr);
        //sorting
        Arrays.sort(sArr);
        Arrays.sort(tArr);
       // System.out.println(tArr);
        //Checking all the char in both string
        for(int i =0;i<sArr.length;i++){
            if(sArr[i] != tArr[i]){
                return false;
            }
        }
        return true;
    }
}
