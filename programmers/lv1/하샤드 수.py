def solution(x):
    answer = True
    li = list(str(x))
    sum = 0
    
    for i in range(len(li)):
        sum += int(li[i])
    
    if x % sum == 0:
        answer = True
    else:
        answer = False
        
    return answer
