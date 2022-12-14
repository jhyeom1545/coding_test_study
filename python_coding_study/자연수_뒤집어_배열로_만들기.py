def solution(n):
    # print(n)
    n = str(n)
    # print(len(n))
    result = []
    for i in range(len(n)-1, -1, -1):
        # print(n[i])
        result.append(int(n[i]))
    # print(result)
    return result


# solution(12345)
