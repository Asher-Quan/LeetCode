class Solution {
    public String reverseVowels(String s) {
        StringBuilder rs = new StringBuilder(s);
        int i = 0;
        int j = rs.length()-1;
        while(i<j){
            if(isVowel(rs.charAt(i)) && isVowel(rs.charAt(j))){
                char a = rs.charAt(i);
                char b = rs.charAt(j);
                rs.setCharAt(i,b);
                rs.setCharAt(j,a);
                i++;j--;
            }else if(isVowel(rs.charAt(i))){
                j--;
            }else if(isVowel(rs.charAt(j))){
                i++;
            }else{
                i++;j--;
            }
        }
        return rs.toString();
    }
    public void swap(Character a,Character b){
        Character c = a;
        a = b;
        b = c;
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}