def solution(s):
    answer = True
    pc = 0
    py = 0
    sl = s.lower()
    
    pc = sl.count('p')
    py = sl.count('y')
    
    if pc == py:
        answer = True
    else:
        answer = False

    return answer
