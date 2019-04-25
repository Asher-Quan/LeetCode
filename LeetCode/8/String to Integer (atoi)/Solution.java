class Solution {
    public int myAtoi(String str) {
        int i = 0;
        int num = 0;
        StringBuilder rs = new StringBuilder();
        int jia = 0;
        int jian = 0;
        while (i < str.length()) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                rs.append(str.charAt(i));
                num++;
            } else if (str.charAt(i) == '-') {
                rs.append(str.charAt(i));
                jian += 1;
            }else if(str.charAt(i) == '+'){
                jia += 1;
            }else if (str.charAt(i) != ' ' && 0 == num) {
                return 0;
            } else if (str.charAt(i) == '.')
                break;
            i++;
        }
        if (num == 0 || jia > 0 && jian >0 || jia > 1 || jian > 1)
            return 0;
        try {
            return Integer.valueOf(rs.toString());
        } catch (NumberFormatException e) {
            if (flag)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }
    }
}