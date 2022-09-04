#include <stdio.h>

int gcd(int a, int b) {
    int g;

    for(int i = 1; i <= a && i <= b; i++) {
        if(a % i == 0 && b % i == 0) {
            g = i;
        }
    }
    return g;
}

int main() {
    int a = 20, b = 28;
    int ans = gcd(a,b);
    printf("%d\n", ans);
    return 0;
}
