#include <stdio.h>

int power(int base, int exponent) {
    if (base == 0) {
        return 0;
    } 
    if (exponent == 0) {
        return 1;
    }
    return base * power(base, exponent - 1);
}

int main() {
    int base, exponent;
    printf("Enter range: ");
    scanf("%d%d", &base, &exponent);
    int ans = power(10, 3);
    printf("%d\n", ans);
    return 0;
}
