def solution(s):
    answer = ''
    ls = len(s)
    ls2 = ls//2
    
    if ls % 2 == 0:
        answer = s[ls2-1:ls2+1]
    else:
        answer = s[ls2]
    return answer
