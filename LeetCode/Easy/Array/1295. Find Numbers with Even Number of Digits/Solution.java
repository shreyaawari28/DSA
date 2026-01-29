class Solution {
    public int findNumbers(int[] nums) {
        int even_count = 0;
        for(int i = 0; i<nums.length; i++){
             int count = 0;

            while(nums[i] != 0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count % 2 == 0){
                even_count ++;
            }
        }
        return even_count;
        
    }
}