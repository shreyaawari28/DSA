class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] miss = new int[2000];
        int m = 0 ;

        for (int i = 1; i <= 2000 ; i++){
            int count = 0;
            for(int j = 0; j < arr.length ; j++){
                if (i == arr[j])
                {
                    count++;
                    break;
                }
            }
            if (count == 0){
                miss [m] = i;
                m++; 
            }
            
                
        }
        return miss[k-1];
    }
}