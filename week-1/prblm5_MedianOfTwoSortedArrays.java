import java.util.*;
class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums1=new int[n];
        for(int i=0;i<n;i++) nums1[i]=sc.nextInt();
        int m=sc.nextInt();
        int[] nums2=new int[m];
        for(int i=0;i<m;i++) nums2[i]=sc.nextInt();

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=0;
        int b=0;
        int size=nums1.length+nums2.length;
        int k=size/2;

        int[] arr=new int[k+1];
        int c=0;
        while(a<nums1.length && b<nums2.length && c<=k){
            if(nums1[a]<nums2[b]) arr[c++]=nums1[a++];
            else arr[c++]=nums2[b++];
        }
        while(a<nums1.length && c<=k) arr[c++]=nums1[a++];
        while(b<nums2.length && c<=k) arr[c++]=nums2[b++];


        if(size%2!=0) return arr[k]*1.000000;
        else return (arr[k]+arr[k-1])/2.0;
    }
}