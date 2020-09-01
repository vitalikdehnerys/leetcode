class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; // negative number cannot be a palindrome 
        }
        int rest,inversed= 0;
        int copyX=x;
        while(copyX!=0) {
            rest=copyX%10;
            inversed=(inversed*10)+rest;
            copyX/=10;  
        }
        return x==inversed ? true : false;
    }
}
