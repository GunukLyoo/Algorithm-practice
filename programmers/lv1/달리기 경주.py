def solution(players, callings):
    answer = []
    count = 1

    for i in range(len(callings)):
        x = players.index(callings[i])
        players[x] = players[x-1]
        players[x-1] = callings[i]
            
    return players
