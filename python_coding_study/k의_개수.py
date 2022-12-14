def solution(i, j, k):
    result = 0
    iNumber = 0
    for a in range(i, j+1):
        if(a < 10):
            if (str(a) == str(k)):
                result+=1
                iNumber+=1
        elif (a > 9):
            first = str(a)[0]
            second = str(a)[1]
            if (first == str(k)):
                result +=1
            if(second == str(k)):
                result +=1
    # print(iNumber)
    print(result)
    return result

# solution(5,50,5)
solution(3,10,2)