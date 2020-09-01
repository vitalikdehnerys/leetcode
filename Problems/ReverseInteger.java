class Solution {
    public int reverse(int x) {
        int rest,inversed=0,prev_inversed=0;
        while(x!=0) {
            rest=x%10;
            inversed=(inversed*10)+rest;
            if ( (inversed-rest)/10!=prev_inversed ) {
                return 0;
            }
            prev_inversed=inversed;
            x/=10;  
        }
        return inversed;
    }
}
