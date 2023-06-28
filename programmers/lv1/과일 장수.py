def solution(k, m, score):
    answer = 0
    score.sort(reverse = True)
    bf = []
    
    for i in range(0,len(score), m):
        bf.append(list(score[i:i+m]))
    
    for i in range(len(bf)):
        if len(bf[i]) == m:
            answer += m * bf[i][m-1]
    return answer
