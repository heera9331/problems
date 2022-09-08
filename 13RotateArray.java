import java.util.Scanner;

class Main {
    static int[] rotateArray(int[] arr, int n, int k) {
        // reverse an array
        
        int b[] = new int[n];
        int m=0;
    
        for(int i = n - k; i < n; i++) {
            b[m++] = arr[i];
        }

        for(int i=0; i<n-k; i++) {
            b[m++]=arr[i];
        }
        
    
        return b;
    }

    static void printArray(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
 
        int[] ans = rotateArray(arr, n, k);
        printArray(ans, n);
    }
}
