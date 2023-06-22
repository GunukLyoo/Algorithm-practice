import math

def solution(n):
    answer = 0
    x = math.sqrt(n)
    if float(x).is_integer() == True:
        answer = (int(x) + 1) **2
    else:
        answer = -1
    return answer
