# https://school.programmers.co.kr/learn/courses/30/lessons/120848

def solution(n):
    if n==1: 
        return 1
    result = 1
    i=1
    while i < n:
        i+=1
        result*=i
        if result == n:
            # print(i)
            return i
        elif result > n:
            # print(i-1)
            return i-1

# solution(7)