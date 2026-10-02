class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int i = 0;
    int j=0;
    int m = nums1.length;
    int n = nums2.length;
    int total = n+m;
    int prev =0, curr=0;
    for(int k =0;k<= total /2;k++){
prev = curr;
if(i==m){
   curr= nums2[j];
    j++;
}else if(j==n){
    curr=nums1[i];
    i++;
}else if(nums1[i]>nums2[j]){
    curr = nums2[j];
    j++;
}else{
    curr = nums1[i];
    i++;
}
    }
    if(total%2==0){
        return (prev+curr) /2.0;
    }else{
        return curr;
    }
        
    }
}