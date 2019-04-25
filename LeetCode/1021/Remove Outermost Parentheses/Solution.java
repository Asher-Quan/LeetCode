class Solution {
    public String removeOuterParentheses(String S) {
        int left = 0;
        int right = 0;
        StringBuilder rs = new StringBuilder("");
        if(S == null || S.length() == 0)
            return "";
        int i = 0;
        int j = 0;
        while(i < S.length()){
            if(S.charAt(i) == '(')
                left++;
            else if(S.charAt(i) == ')' && left>0)
                left--;
            else
                right++;
            if(left == 0){
                for(j = j + 1;j<i;j++){
                    rs.append(S.charAt(j));
                }
                j = i+1;
            }
            i++;
        }
        if(left == 0 && right ==0)
            return rs.toString();
        return "";
    }
}