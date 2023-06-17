def solution(n):
    answer = 0
    result = ''
    
    while n > 0:
        remainder = n % 3
        result = str(remainder) + result
        n = n // 3
    
    c = 1
    
    for i in result:
        answer += int(i) * c
        c *= 3
    
    return answer
