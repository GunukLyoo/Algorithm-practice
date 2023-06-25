def solution(a, b):
    answer = 0
    x = 0
    y = 0
    
    if a< b:
        x = a
        y = b
    else:
        x = b
        y = a
    
    for i in range(x, y+1):
        answer += i
    return answer
