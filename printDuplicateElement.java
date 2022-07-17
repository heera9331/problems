
// import important classes
import java.util.Scanner;

class printDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // declare array 
        int[] nums = new int[n];

        // input array
        for(int i=0; i<n; i++) {
            nums[i] =  sc.nextInt();
        }

        // start program
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) { 
                if(nums[i] == nums[j]) {
                    System.out.println(nums[j]);
                }   
            }
        }
    }
}
