def solution(players, callings):
    answer = []
    count = 0

    for i in range(len(callings)):
        for j in range(1, len(players)):
            if players[j] == callings[i]:
                players[j] = players[j-1]
                players[j-1] = callings[i]
                break
    
    return players
