class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while( i < name.length() && j < typed.length() ){
            if(name.charAt(i) == typed.charAt(j)){
                j++;
            }else if(i+1 < name.length() && name.charAt(i+1) == typed.charAt(j) ){
                i++;
            }else{
                return false;
            }
        }
        if( i < name.length() - 1)
            return false;
        else
            return true;
    }
}