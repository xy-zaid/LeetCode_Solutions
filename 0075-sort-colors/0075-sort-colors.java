class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one =0,two=0;
        if (nums.length != 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0)
                    zero++;
                if (nums[i] == 1)
                    one++;
                if (nums[i] == 2)
                    two++;
            }
            for(int i = 0; i < zero; ++i) nums[i] = 0;
    for(int i = 0; i < one; ++i) nums[zero+i] = 1;
    for(int i = 0; i < two; ++i) nums[zero+one+i] = 2;
        }
    }
}