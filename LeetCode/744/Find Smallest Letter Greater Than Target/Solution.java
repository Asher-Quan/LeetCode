/**
 * Solution
 */
public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i;
        for(i = 0 ; i < letters.length;i++){
            if(letters[i] > target)
                break;
        }
        if(i == letters.length)
            return letters[0];
        else
            return letters[i];
    }
}