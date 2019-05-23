class Solution {
    private int n = 0;
    private int m = 0;
    public boolean check(int tempx,int tempy){
        if(tempx >=0 && tempy >= 0 && tempx <n && tempy < m)
            return true;
        else
            return false;
    }
    public int numRookCaptures(char[][] board) {
        n = board.length;
        m = board[0].length;
        int x = 0;
        int y = 0;
        for(int i = 0 ; i <n ;i++)
            for(int j = 0; j < m ; j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                    break;
                }
            }
        int count = 0;
        int [][]dir = {{-1,0},{0,1},{1,0},{0,-1}};
        for(int i = 0 ; i < 4 ;i++){
            int tempx = x;
            int tempy = y;
            while(check(tempx,tempy) && board[tempx][tempy] != 'B'){
                if(board[tempx][tempy] == 'p'){
                    count++;
                    break;
                }
                tempx = tempx + dir[i][0];
                tempy = tempy + dir[i][1];
            }
        }
        return count;
    }
}