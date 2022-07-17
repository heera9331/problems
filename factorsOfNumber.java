
import java.util.Scanner;
class factorsOfNumber {
    public static void main(String[] args) {
        // declare object of scanner class
        Scanner sc = new Scanner(System.in);

        
        // display this // message
        System.out.println("Enter number: ");

        // take input n
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            // if n is divisible by i mean i is the factor n
            if(n%i == 0) {
                // printing them
                System.out.println(i);
            }
        }
    }
}
