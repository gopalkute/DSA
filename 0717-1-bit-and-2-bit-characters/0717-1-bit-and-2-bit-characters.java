class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        if(len == 1) return true;
        if(bits[len - 1] != 0) return false;

        int i = 0;
        while(i < len){
            if(bits[i] == 0){
                if(i == len - 1) return true;
                i++;
            }

            if(bits[i] == 1){
                i += 2;
            }
        }

        return false;

    }
}