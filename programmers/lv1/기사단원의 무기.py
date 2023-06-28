def solution(number, limit, power):
    answer = 0
    c = [1]
    count = 0
    j = 1
    
    for i in range(2, number + 1):
        count = 0
        j = 1
        while j * j <= i:
            if j * j == i:
                count += 1
                break
            elif i%j == 0:
                count += 2
            j+=1
    
        c.append(count)
    
    for i in c:
        if i > limit:
            answer += power
        else:
            answer += i
    
    return answer
