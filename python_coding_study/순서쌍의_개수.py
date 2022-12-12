def solution(n):
    result = 0
    for i in range(n):
        if n % (i+1) == 0:
            result+=1
    # print(result) 결과 확인
    return result

# n = 20
# solution(n)