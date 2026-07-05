class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                count--;
            }
            count++;
        }
        for (int i=0; i<count; i++){
            if (nums[i] == -1){
                for (int j=i; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return count;
    }
}