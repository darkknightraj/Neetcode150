import java.util.Scanner;

public class ValidAnagramOptimal {
    public static void main(String[] args){
        String s = "rat";
        String t = "cat";
        boolean result  = validAnagram(s,t);
        System.out.println(result);

    }
    static  boolean validAnagram(String s, String t){
        if(s.length() != t.length()){
            return  false;
        }
        int [] charCounts = new int[26];
        for(int i = 0 ;i<s.length();i++){
            charCounts[s.charAt(i)-'a'] ++;
            charCounts[t.charAt(i)-'a'] --;
        }

        //count all char is zero
        for(int count : charCounts){
            if(count != 0){
                return false;

            }
        }
        return  true;
    }
}
