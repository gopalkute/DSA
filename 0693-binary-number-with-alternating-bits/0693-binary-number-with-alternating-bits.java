class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n == 0) return false;
        while(n > 0){
            int first = (n & 1);
            n = n >> 1;
            int second = (n & 1);
            if(first == second) return false;

        }
        return true;
    }
}