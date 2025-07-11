class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int a=0;
        int [] arr=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[a]=nums1[i];
                i++;
                a++;
                
            }
            else{
                arr[a]=nums2[j];
                j++;
                a++;
            }
        }
        if(i<m){
            
            while(i<m){
                
                 arr[a]=nums1[i];
                 i++;
                 a++;
            }
        }
        if(j<n){
            while(j<n){
                
                arr[a]=nums2[j];
                j++;
                a++;
            }
        }
        for(int c=0;c<arr.length;c++){
            nums1[c]=arr[c];
        }
        
    }
}