import math

def solution(n):
    answer = 0
    prime = [True for i in range(n+1)]
    x = 0
    
    prime[0] = False
    prime[1] = False
    for i in range(2, int(math.sqrt(n))+1):
        if prime[i] == True:
            x = 2
            while i * x < n+1:
                prime[i * x] = False
                x += 1
    
    for i in range(n+1):
        if prime[i] == True:
            answer += 1
                
    return answer
