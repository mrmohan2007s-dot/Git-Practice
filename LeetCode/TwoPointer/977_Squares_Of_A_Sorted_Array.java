class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,pos=nums.length-1;
        int[] rev=new int[nums.length];
        while(l<=r){
            int lf=nums[l]*nums[l];
            int rf=nums[r]*nums[r];
            if(lf>rf){
                rev[pos]=lf;
                l++;
            }else{
                rev[pos]=rf;
                r--;
            }
            pos--;
        }
        return rev;
    }
}