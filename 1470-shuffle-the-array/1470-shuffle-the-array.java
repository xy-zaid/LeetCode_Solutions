class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[2*n];
        int count=0,count1=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				a[i]=nums[count++];
			}
			else {
				a[i]=nums[n+count1++];
			}
		}
        return a;
    }
}