#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int x = 1;
    int t = 0;
    for(int i=0;i<num_list_len;i++) {
        x*=num_list[i];
        t+=num_list[i];
    }
    t=t*t;
    if(x<t) {
        return 1;
    }
    return 0;
}