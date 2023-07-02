def solution(a, b):
    answer = 0
    n1 = int(str(a) + str(b))
        
    if n1 < 2 * a * b:
        answer = 2*a*b
    else:
        answer = n1
    
    return answer
