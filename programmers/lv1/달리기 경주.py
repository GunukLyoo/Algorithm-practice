def solution(players, callings):
    answer = []
    sc = callings.sort()
    count = 1
    for i in range(1, len(callings)):
        if players[i-1] == players[i]:
            count += 1
        else:
            j = players.index(players[i-1])
            print(players[i-1])
            x = players[j]
            for i in range(1, count+1):
                players[j-(i-1)] = players[j-i]
            players[j-count] = x
            count = 1
        
    answer = players
    
    return answer
