
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        boolean perfectCube = false;
        for(int i=1; i<n; i++) {
            int cube = i*i*i;  
            if (cube == n){
                perfectCube = true;
                break;
            } else if (cube >= n) {
                perfectCube = false;
            }
        }

        if (perfectCube == true) {
            System.out.println("Perfect cube");
        } else {
            System.out.println("Not perfect cube");
        }

    }
}
