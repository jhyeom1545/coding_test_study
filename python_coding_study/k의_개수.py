def solution(i, j, k):
    result = 0
    for a in range(i, j+1):
        if(a < 10 and str(a) == str(k)):
                result+=1
        elif (a > 9):
            first = str(a)[0]
            second = str(a)[1]
            if (first == str(k)):
                result +=1
            if(second == str(k)):
                result +=1
    print(result)
    return result

solution(10,50,5)