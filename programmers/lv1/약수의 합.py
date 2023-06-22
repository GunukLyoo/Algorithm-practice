import math

def solution(n):
    answer = 0
    sn = 0
    
    if n != 0:
        sn = int(math.sqrt(n))
        
        for i in range(1, sn + 1):
            if i ** 2 == n:
                answer += i
            else:
                if n % i == 0:
                    answer += (i + n // i)
        
    return answer
