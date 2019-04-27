class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            if("+".equals(ops[i])){
                int high = stack.pop();
                int low = stack.peek();
                sum = sum + high +low;
                stack.push(high);
                stack.push(high+low);
            }else if("C".equals(ops[i])){
                int temp = stack.pop();
                sum = sum - temp;
            }else if("D".equals(ops[i])){
                int temp = stack.peek();
                sum = sum + (temp*2);
                stack.push(temp*2);
            }else{
                sum = sum + Integer.valueOf(ops[i]);
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        return sum;
    }
}