def solution(n, m):
    answer = []
    a = b = 0
    r = -1
    
    if n > m:
        a = n
        b = m
    elif n < m:
        a = m
        b = n
    else:
        answer.append(n)
        answer.append(n)
        
        return answer
    
    r = a % b
    
    while r != 0:
        a = b
        b = r
        r = a % b
    
    mul = n * m / b
    
    answer.append(b)
    answer.append(mul)
    return answer
