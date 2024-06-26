import java.util.Locale;

/**
 * Description:
 * Date: 2024-06-26
 * Time: 23:22
 */


class Solution {

    public static boolean isCharNums(char ch) {
        if(Character.isDigit(ch)||(Character.isLetter(ch))){
            return true;
        }else
            return false;
    }

    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            while (left<right && !isCharNums(s.charAt(left))){
                left++;
            }
            while (left>right && !isCharNums(s.charAt(right))){
                right--;
            }
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }


}