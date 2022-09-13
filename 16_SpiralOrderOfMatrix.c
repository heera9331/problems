#include <stdio.h>

int main(int argc, char const *argv[]) {
    // n -> number of row
    // m -> number of column column
    int n,m;
    scanf("%d %d", &n, &m);

    int arr[n][m];

    // read array
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            scanf("%d", &arr[i][j]);
        }
    }

    int row_start = 0, row_end = n-1;
    int col_start = 0, col_end = m - 1;

    while (row_start <= row_end && col_start <= col_end) {
        // row start
        for(int row=row_start; row<=col_end; row++) {
            // arr[0][0], arr[0][1], arr[0][2]
            // 1 2 3
            printf("%d ", arr[row_start][row]);
        }
        ++row_start;
        
        // column start

        for(int col = row_start; col <= row_end; col++) {
            // arr[0][2]
            // arr[1][2]
            // arr[2][2]
            printf("%d ", arr[col][col_end]);
        }
        --col_end;
        
        // end row
        for(int row=col_end; row>=col_start; row--) {
            // arr[2][1], arr[2][0]
            printf("%d ", arr[row_end][row]);
        }
        --row_end;

        // column end
        for(int col=row_end; col>=row_start; col--) {
            
            // arr[1][1]
            //arr[0][1]
            printf("%d ", arr[col][col_start]);
        }
        ++col_start;
        // break;
    }
    return 0;
}
