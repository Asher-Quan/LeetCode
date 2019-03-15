/**
 * Solution
 */
public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int count = 0;
        int a=0;
         int b=0;
        int c=0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5)
                a++;
            else if(bills[i] == 10){
                if(a>=1){
                    a--;
                    b++;
                }else
                    return false;
            }
            else if(bills[i] == 20){
               if(a>=1 && b>=1){
                    a--;
                    b--;
                    c++;
                }else if(a>=3){
                    a = a-3;
                }else
                    return false;
            }
        }   
        return true;
    }
}