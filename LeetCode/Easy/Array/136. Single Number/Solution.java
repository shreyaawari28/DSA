class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for(int i = 0; i< nums.length; i++){
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if (nums.length == 1){
                 return unique = nums[0];
                }

                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                unique = nums[i];
                break;
            }
        }
        return unique;
    }
}