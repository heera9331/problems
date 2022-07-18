
// Array sorting - using bubble sort

import java.util.Scanner;

class Main {
    static void bubbleSort(int[] nums, int n) {
        for(int i=0;i<n-1;i++) {
            for(int j=0; j<n-i-1; j++) {

                if(nums[j]>nums[j+1]){
                    // swap logic
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
    }

    static void printArray(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

       
        bubbleSort(arr, n);
        System.out.println();
        printArray(arr);

    }
}

