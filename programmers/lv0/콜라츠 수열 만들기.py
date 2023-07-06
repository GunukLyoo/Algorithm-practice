def solution(n):
    answer = []
    
    while n != 1:
        answer.append(n)
        if n % 2 == 0:
            n //= 2
        elif n % 2 == 1:
            n = n * 3 + 1
    
    answer.append(n)
    return answer
