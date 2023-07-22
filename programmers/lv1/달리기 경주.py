def solution(players, callings):
    answer = []
    dct = {players[i]:i+1 for i in range(len(players))}
    ix = 0
    for i in callings:
        ix = dct[i]
        for key, val in dct.items():
            if ix - 1 == val:
                dct[key] += 1
                break
        dct[i] -= 1
    
    dct = sorted(dct.items(), key = lambda item: item[1])
    
    answer = [i[0] for i in dct]
    
    return answer
