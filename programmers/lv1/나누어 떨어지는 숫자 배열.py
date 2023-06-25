def solution(arr, divisor):
    answer = []
    c = 0
    
    for i in arr:
        if i % divisor == 0:
            answer.append(i)
            c += 1
    
    if c == 0:
        answer.append(-1)
        
    answer.sort()
    return answer
