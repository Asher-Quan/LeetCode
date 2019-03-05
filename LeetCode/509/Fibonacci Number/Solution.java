/**
 * Solution
 */
public class Solution {
    public int fib(int N) {
        if(N == 0)
            return 0;
        int []arr = new int[N+2];
        arr[1] = 1;
        arr[2] = 1;
        for(int i =3;i<N+2;i++)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[N];
    }
}