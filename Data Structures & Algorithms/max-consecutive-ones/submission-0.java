class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int masterCount =0;
        for (int e: nums){
            count++;
            if (e == 0){
                count =0;
            }
            masterCount = Math.max(count, masterCount);
        }
        return masterCount;
    }
}