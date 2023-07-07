def solution(a, b, c, d):
    answer = 0
    arr = [a,b,c,d]
    arr1 = [arr.count(i+1) for i in range(6)]
    mx = max(arr1)
    i = 0
    x = 0
    
    if mx == 4:
        answer = 1111 * (arr1.index(mx) + 1)
    elif mx == 3:
        answer = (10 * (arr1.index(mx) + 1) + (arr1.index(1) + 1)) ** 2
    elif mx == 2 and arr1.count(mx) == 2:
        i = arr1.index(mx) + 1
        x = arr1[i:].index(mx) + 1 + i
        answer = (i + x) * (x - i)
    elif mx == 2 and arr1.count(mx) != 2:
        i = arr1.index(1) + 1
        x = arr1[i:].index(1) + 1 + i
        answer = i * x
    elif mx == 1:
        answer = min(arr)
    
    return answer
