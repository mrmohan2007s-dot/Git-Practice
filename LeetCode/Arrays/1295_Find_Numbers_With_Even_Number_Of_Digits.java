class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
            int temp=num;
            int digit=0;
            while(temp>0){
                digit++;
                temp/=10;
            }
            if(digit%2==0){
                c++;
            }
        }
        return c;
    }
}