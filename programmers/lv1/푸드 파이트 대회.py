def solution(food):
    answer = ''
    m = 0
    
    for i in range(1, len(food)):
        m = food[i]//2
        for j in range(m):
            answer += str(i)
    
    st = "".join(reversed(answer))
    
    answer += '0'
    answer += st
            
    return answer
