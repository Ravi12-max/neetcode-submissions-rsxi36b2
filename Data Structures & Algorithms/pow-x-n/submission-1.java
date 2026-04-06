class Solution {
    public double myPow(double x, int n) {
        if(n==0) return (double)1;
        if(n == Integer.MIN_VALUE) {
            n = n / 2;
            x = x * x;
        }
        double call=myPow(x,n/2);
        if(n%2==0) return call*call;
        else{
            if(n>0) return x*call*call;
            else return (call*call)/x;
        }
    }
}
