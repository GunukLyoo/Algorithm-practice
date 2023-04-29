def solution(players, callings):
    answer = []
    ad = dict()
    for i in range(len(players)):
        ad[i+1] = players[i]   

    for i in range(len(callings)):
        for j in range(len(players)):
            if ad[j+1] == callings[i]:
                ad[j+1] = ad[j]
                ad[j] = callings[i]
                break
        
    for i in ad.values():
        answer.append(i)
    
    return answer
