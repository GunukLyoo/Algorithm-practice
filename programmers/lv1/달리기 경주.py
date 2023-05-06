def solution(players, callings):
    answer = []
    count = 1

    for i in range(1, len(callings)):
        if callings[i-1] == callings[i]:
            count += 1
        else:
            count = 1


    for j in range(1, len(players)):
            if players[j] == callings[i]:
                players[j] = players[j-1]
                players[j-1] = callings[i]
                break
    
    return players
