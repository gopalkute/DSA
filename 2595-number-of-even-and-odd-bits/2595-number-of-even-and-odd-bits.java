class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int current = 0;
        while(n > 0){
            if((n & 1) != 1) {
                n >>= 1;
                current++;
                continue;
            }

            if((current & 1) == 1){
                odd++;
            }else{
                even++;
            }
            n >>= 1;
            current++;
        }

        return new int[]{even, odd};
    }
}