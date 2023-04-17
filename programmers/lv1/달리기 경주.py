def solution(players, callings):
    answer = []
    for i in callings:
        x = players.index(i)
        bf = players[x-1]
        players[x-1] = i
        players[x] = bf
        
    answer = players
    
    return answer
