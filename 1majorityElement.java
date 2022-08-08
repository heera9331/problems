/*
  [3,3,3,1,1,2]
  
  output 3
*/
class Solution {
  
static boolean check(int arr[] ,int element) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    static int count(int arr[], int element) {
        int c=0, n = arr.length;
        for(int i=0; i<n; i++) {
            if (arr[i] == element) {
                c++;
            }
        }
        return c;
    }

    static int majorityElement(int a[], int size) {
        int n = size;
        int m=0;
        int b[] = new int[n];

        for(int i=0; i<n; i++) {
            if (!check(b, a[i])) {
                b[m++] = a[i];
            }
        }
        int ans=0,t;
        for(int i=0; i<m; i++) {
            t = count(a, b[i]);
            if (ans<t) {
                ans = t;
            }
        }
        return (ans > n/2 ? ans : -1);
    }
}
