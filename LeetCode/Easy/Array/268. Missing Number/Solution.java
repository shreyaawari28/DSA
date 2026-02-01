class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int missing = 0;
        int i,j;

        for ( i = 0; i <= nums.length ; i++){
            int count = 0;
            for ( j = 0; j < nums.length ; j++){
                if( i == nums[j]){
                    count++;
                }
            }
            if(count == 0){
                missing = i;
                break;
            }

        }
        return missing;

    }
}