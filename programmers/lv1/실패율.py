def solution(N, stages):
    answer = []
    dct = {}
    p = len(stages)
    for i in range(N):
        x = stages.count(i+1)
        if p == 0:
            dct[i+1] = 0
        else:
            dct[i+1] = x/p
            p -= x
    sd = sorted(dct.items(), key = lambda item: item[1], reverse = True)
    for i in sd:
        answer.append(i[0])
    return answer
