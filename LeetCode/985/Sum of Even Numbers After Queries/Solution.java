class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int n = queries.length;
        int rs[] = new int[n];
        int sum = 0;
        for (int i : A) {
            if(i%2 == 0)
                sum += i;
        }
        for(int i = 0 ; i < n ; i++ ){
            int temp = A[queries[i][1]];
            A[queries[i][1]] += queries[i][0];
            if(temp % 2 ==0){
                sum = sum - temp;
            }
            if(A[queries[i][1]] % 2 == 0)
                sum = sum + A[queries[i][1]];
            rs[i] = sum;
        }
        return rs;
    }
}