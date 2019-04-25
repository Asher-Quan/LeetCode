class Solution {
    public boolean judgeCircle(String moves) {
        int [] array = new int[26];
        for(int i = 0 ; i < moves.length() ; i++){
            array[moves.charAt(i)-'A']++;
        }
        if(array[3] - array[20] == 0 && array[11] - array[17] ==0)
            return true;
        else
            return false;
    }
}