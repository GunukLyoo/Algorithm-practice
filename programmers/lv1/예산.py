def solution(d, budget):
    answer = 0
    sum = 0
    c = 0
    
    if len(d) == 1:
        if d[0] <= budget:
            answer = 1
        else:
            answer = 0
    else:
        d.sort()
        
        while sum <= budget:
            if c >= len(d):
                break
            if sum + d[c] <= budget:
                sum += d[c]
                answer += 1
            c += 1
            
    return answer
