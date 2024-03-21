class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] pfSumEven = new int[n];
        int[] pfSumOdd = new int[n];
        
        pfSumEven[0] = nums[0];
        pfSumOdd[0] = 0;
        
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                pfSumEven[i] = pfSumEven[i - 1] + nums[i];
                pfSumOdd[i] = pfSumOdd[i - 1];
            }
            else{
                pfSumOdd[i] = pfSumOdd[i - 1] + nums[i];
                pfSumEven[i] = pfSumEven[i - 1];
            }
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            int totalEven, totalOdd;
            if(i == 0){
                totalEven = pfSumOdd[n-1] - pfSumOdd[i];
                totalOdd = pfSumEven[n - 1] - pfSumEven[i];
            }
            else{
                totalEven = pfSumEven[i - 1] + pfSumOdd[n - 1] - pfSumOdd[i];
                totalOdd = pfSumOdd[i - 1] + pfSumEven[n - 1] - pfSumEven[i];
            }

            if(totalEven == totalOdd){
                ans++;
            }
        }
        return ans;
    }
}
