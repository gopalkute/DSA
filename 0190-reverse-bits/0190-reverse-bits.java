class Solution {
    public int reverseBits(int n) {
        
        int revNum = 0;
        int count = 0;

        while(n > 0){
            revNum = revNum << 1;
            if((n & 1) != 0) revNum = revNum | 1;
            n = n >> 1;
            count++;
        }

        return revNum << 32 - count;
    }
}