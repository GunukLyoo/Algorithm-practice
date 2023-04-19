def solution(players, callings):
    answer = []
    count = 1
    for i in range(1, len(callings)):
        if players[i-1] == players[i]:
            count += 1
        
    answer = players
    
    return answer
