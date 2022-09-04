#include <stdio.h>

int lcm(int a, int b) {
    int l = a>b?a:b;

    while(1) {
        if(l % a == 0 && l % b == 0) {
            return l;
        }
        ++l;
    }
}

int main() {
    int a = 6, b = 12;
    int ans = lcm(a,b);
    printf("%d\n", ans);
    return 0;
}
