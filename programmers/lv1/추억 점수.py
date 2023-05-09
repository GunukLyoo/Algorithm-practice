def solution(name, yearning, photo):
    answer = []
    point = dict()
    
    for i in range(len(name)):
        point[name[i]] = yearning[i]
    
    count = 0
    
    for i in range(len(photo)):
        for j in range(len(photo[i])):
            if photo[i][j] in point:
                count += point[photo[i][j]]
        answer.append(count)
        count = 0
    
    return answer
