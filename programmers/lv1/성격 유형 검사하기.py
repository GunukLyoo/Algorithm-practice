def solution(survey, choices):
    answer = ''
    ty = ['RT', 'CF', 'JM', 'AN']
    sc = [0 for i in range(4)]
    li = []
    
    for i in range(len(survey)):
        if survey[i] == 'RT':
            sc[0] += (choices[i] - 4)
        elif survey[i] == 'TR':
            sc[0] -= (choices[i] - 4)
        elif survey[i] == 'CF':
            sc[1] += (choices[i] - 4)
        elif survey[i] == 'FC':
            sc[1] -= (choices[i] - 4)
        elif survey[i] == 'JM':
            sc[2] += (choices[i] - 4)
        elif survey[i] == 'MJ':
            sc[2] -= (choices[i] - 4)
        elif survey[i] == 'AN':
            sc[3] += (choices[i] - 4)
        elif survey[i] == 'NA':
            sc[3] -= (choices[i] - 4)
    
    for i in range(len(sc)):
        li = list(ty[i])
        if sc[i] <= 0:
            answer += li[0]
        elif sc[i] > 0:
            answer += li[1]
    return answer
