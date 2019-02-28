/**
 * Solution
 */
public class Solution {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i<=j){
            swap(s, i, j);
            i++;
            j--;
        }
    }
    public static void swap(char[] s , int i ,int j){
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }
    public static void main(String[] args) {
        char[] s = "dddddd";
        reverseString(s);
    }
}