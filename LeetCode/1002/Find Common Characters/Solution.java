import java.util.List;

class Solution {
    public List<String> commonChars(String[] A) {
        int [][] temp = new int[A.length][26];
        for (int i = 0 ; i < A.length; i++) {
            for(int j = 0 ; j < A[i].length(); j++){
                temp[i][A[i].charAt(j)-'a']++;
            }
        }
        List<String> list = new ArrayList<String>();
        for(int i = 0 ; i < 26 ;i++){
            int min = 101;
            for(int j = 0 ; j < A.length; j++){
                min = Math.min(temp[j][i], min);
            }
            for(int k = 0 ; k < min ; k++){
                list.add(String.valueOf((char)(i+'a')));
            }
        }
        return list;
    }
}