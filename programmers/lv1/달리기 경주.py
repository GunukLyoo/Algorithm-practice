def solution(players, callings):
    answer = []
    bf = [[players[i],i+1] for i in range(len(players))]
    ix = 0
    for i in callings:
        for j in range(len(bf)):
            if bf[j][0] == i:
                ix = bf[j][1]
                for k in range(len(bf)):
                    if bf[k][1] == ix-1:
                        bf[k][1] += 1
                bf[j][1] -= 1
        
    bf.sort(key = lambda x:x[1])
    
    answer = [bf[i][0] for i in range(len(bf))]
    
    return answer
