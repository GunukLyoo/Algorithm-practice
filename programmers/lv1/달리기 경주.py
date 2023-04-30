def solution(players, callings):
    answer = []

    for i in range(len(callings)):
        for j in range(len(players)):
            if players[j] == callings[i]:
                players[j] = players[j-1]
                players[j-1] = callings[i]
                break
    
    return players
