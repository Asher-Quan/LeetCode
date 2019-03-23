class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        boolean flag = false;
        while(i < bits.length){
            if(bits[i] == 1){
                i = i + 2;
                flag = false;
            }else{
                i = i + 1;
                flag = true;
            }
        }
        return flag;
    }
}