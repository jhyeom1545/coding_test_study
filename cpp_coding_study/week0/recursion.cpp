#include<bits/stdc++.h>
// 재귀함수
// 정의 단계에서 자신을 재 참조하는 함수
// 전달되는 상태인 매개변수가 달라질 뿐 똑같은 일을 하는 함수
// 큰 문제를 작은 문제로 나눠서 풀 때 사용

using namespace std;

int fact(int n ){
    if(n ==1 || n == 0) return 1;
    return n * fact(n-1);
}

// 팩토리얼 반복문 사용하기
int d = 20;
int fact2(int d ) {
    int num = 1;
    for(int i = 1; i <= d; i++){
        num *= i;
    };
    return num;
}

int fibo(int n){
    if(n == 0 || n ==1) return n;
    return fibo(n -1) + fibo(n-2);
}

int n = 5;
int main(){
    cout << fact(n) << " " << fibo(n) << '\n';
    return 0;
}

